package in.ac.iitb.cfilt.topicmodel;

import in.ac.iitb.cfilt.common.io.UTFReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;

public class cartesianProductData {
	
	public static void main(String args[])throws Exception{
		System.out.println("creating sentences");
		SentenceCreation();
	}
	


	private static void SentenceCreation() throws IOException, ClassNotFoundException, SQLException {

		//int topics=50;
		int topics=50; // Static line for HealthData File with default 50 topics
		int k=2; //number of words in this program, uncomment the number of for loops below for number of words for k=5, it is currently working, uncomment next two loops for k=6 and so on..
		//UTFReader reader = new UTFReader("Health"+topics);
		UTFReader reader = new UTFReader("TourismData");
		UTFReader reader1 = new UTFReader("tourism/train.en");
		UTFReader reader2 = new UTFReader("tourism/train.hi");
		//File filedir = new File("health"+topics+"SourceCartesiank"+k);
		//File filedir1 = new File("health"+topics+"TargetCartesiank"+k);
		File filedir = new File("K"+k+"/moses_tourism_topicModel_cartesian_HE/tourism_HE/train.en");
		File filedir1 = new File("K"+k+"/moses_tourism_topicModel_cartesian_HE/tourism_HE/train.hi");
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
		String[][] englishList = new String[topics][k];
		String[][] hindiList = new String[topics][k];
		while ((line = reader.readLine()) != null) {
//			System.out.println(line);
			String Words[] = line.split("\t");
			int a = Words.length;
			if(a<=0){
				topicNumber++;
				wordNumber=0;
			}
			else{
				if(Words.length==2 && wordNumber < k){
//					System.out.println(line);
					englishList[topicNumber][wordNumber] = Words[0];
					hindiList[topicNumber][wordNumber] = Words[1];
					wordNumber++;
				}
			}
		}
		System.out.println("\n\n"+topicNumber);
		for(int j=0;j<topics;j++){
			
			for(int i=0;i<k;i++){
				out.append(englishList[j][0]);
				out.append("\n");
			}	
			for(int i=0;i<k;i++){
				out1.append(hindiList[j][i]);
				out1.append("\n");

			}
			for(int i=0;i<k;i++){
				out.append(englishList[j][1]);
				out.append("\n");
			}
						
			for(int i=0;i<k;i++){
				out1.append(hindiList[j][i]);
				out1.append("\n");

			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][2]);
//				out.append("\n");
//			}
//						
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][3]);
//				out.append("\n");
//			}
//						
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][4]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][5]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][6]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][7]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][8]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][9]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
//			for(int i=0;i<k;i++){
//				out.append(englishList[j][10]);
//				out.append("\n");
//			}
//			for(int i=0;i<k;i++){
//				out1.append(hindiList[j][i]);
//				out1.append("\n");
//
//			}
		}		
		out.flush();
		out.close();
		out1.flush();
		out.close();
		
	}
	

}
