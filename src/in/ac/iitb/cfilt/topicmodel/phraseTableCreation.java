package in.ac.iitb.cfilt.topicmodel;

import in.ac.iitb.cfilt.common.io.UTFReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;

public class phraseTableCreation {
	public static void main(String args[])throws Exception{
		System.out.println("creating sentences");
		SentenceCreation();
	}
	private static void SentenceCreation() throws IOException, ClassNotFoundException, SQLException {

		int topics=100;
		UTFReader reader = new UTFReader("Health100");
		File filedir = new File("phrase-table");
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir),"UTF-8"));
		String line = null;
		reader.open();
		int lineNumber = 1;
		int topicNumber=0;
		int wordNumber=0;
		String[][] englishList = new String[topics][11];
		String[][] hindiList = new String[topics][11];
		while ((line = reader.readLine()) != null) {
			
			String Words[] = line.split("\t");
			int a = Words.length;
			if(a<=0){
//				System.out.println("Tab Wala Line Mila");
				topicNumber++;
				wordNumber=0;
			}
			else{
				if(Words.length==2){
//					System.out.println(line);
					englishList[topicNumber][wordNumber] = Words[0];
					hindiList[topicNumber][wordNumber] = Words[1];
					wordNumber++;
				}
			}
			
		}
		System.out.println("\n\n"+topicNumber);
		for(int j=0;j<topics;j++){
			for(int i=0;i<11;i++){
//				System.out.println(hindiList[0][i]);
				out.append(englishList[j][0]);
				out.append(" |||");
				out.append(hindiList[j][i]);
				out.append(" |||");
			}
		}
		
	}
}
