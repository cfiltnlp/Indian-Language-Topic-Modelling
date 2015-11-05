package in.ac.iitb.cfilt.topicmodel;

import in.ac.iitb.cfilt.common.io.UTFReader;

import java.util.Iterator;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sentenceFormation {
	
	public static void main(String args[])throws Exception{
		System.out.println("creating sentences");
		SentenceCreation();
	}
	


	private static void SentenceCreation() throws IOException, ClassNotFoundException, SQLException {

		//int topics=50;
		int topics=50; // Static line for HealthData File with default 50 topics
		int[] k={2,3,4,6,7,8,9,10}; //number of words
		//UTFReader reader = new UTFReader("Health"+topics);
		UTFReader reader = new UTFReader("HealthData");
		UTFReader reader1 = new UTFReader("health/train.en");
		UTFReader reader2 = new UTFReader("health/train.hi");
		//File filedir = new File("Health"+topics+"Sourcek"+k);
		//File filedir1 = new File("Health"+topics+"Targetk"+k);
		for(int q=0;q<8;q++){
			File filedir = new File("K"+k[q]+"/moses_health_topicModel_HE/corpus/train.en");
			File filedir1 = new File("K"+k[q]+"/moses_health_topicModel_HE/corpus/train.hi");
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir),"UTF-8"));
			Writer out1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir1),"UTF-8"));
			String line = null;
			reader.open();
			reader1.open();
			reader2.open();
			while ((line = reader1.readLine()) != null) {
				out.append(line+"\n");
			}
			while ((line = reader2.readLine()) != null) {
				out1.append(line+"\n");
			}
			int lineNumber = 1;
			int topicNumber=0;
			int wordNumber=0;
		
			String[][] englishList = new String[topics][k[q]];
			String[][] hindiList = new String[topics][k[q]];
			while ((line = reader.readLine()) != null) {
	//			System.out.println(line);
				String Words[] = line.split("\t");
				int a = Words.length;
				if(a<=0){
	//				System.out.println("Tab Wala Line Mila");
					topicNumber++;
					wordNumber=0;
				}
				else{
					if(Words.length==2 && wordNumber < k[q]){
	//					System.out.println(line);
						englishList[topicNumber][wordNumber] = Words[0];
						hindiList[topicNumber][wordNumber] = Words[1];
						wordNumber++;
					}
				}
			}
			System.out.println("\n\n"+topicNumber);
			for(int j=0;j<topics;j++){
				for(int i=0;i<k[q];i++){
	//				System.out.println(hindiList[0][i]);
					out.append(englishList[j][i]);
					if(i!=10){
						out.append(" ");
					}
				}
				out.append("\n");
				for(int i=0;i<k[q];i++){
	//				System.out.println(hindiList[0][i]);
					out1.append(hindiList[j][i]);
					if(i!=10){
						out1.append(" ");
					}
				}
				out1.append("\n");
			}		
			out.flush();
			out.close();
			out1.flush();
			out.close();
		}
	}
}
