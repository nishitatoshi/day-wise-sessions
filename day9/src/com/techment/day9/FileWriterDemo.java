package com.techment.day9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("abc.txt", true);
		fw.write("hello \n");
		fw.write("there \n");
		System.out.println("written successfully..");
		fw.close();

	}

}
