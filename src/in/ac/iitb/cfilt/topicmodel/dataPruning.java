package in.ac.iitb.cfilt.topicmodel;

import in.ac.iitb.cfilt.common.io.UTFReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;

public class dataPruning {

	public static void main(String args[])throws Exception{
		System.out.println("Pruning data");
		dataPruning();
	}
	
	private static void dataPruning() throws IOException, ClassNotFoundException, SQLException {

		int topics=100;
		UTFReader reader = new UTFReader("Health100");
		File filedir = new File("Health100Source");
		File filedir1 = new File("Health100Target");
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir),"UTF-8"));
		Writer out1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir1),"UTF-8"));
		String line = null;
		
	}
	
}
