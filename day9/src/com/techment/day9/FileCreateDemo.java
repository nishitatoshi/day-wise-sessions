package com.techment.day9;
import java.io.File;
import java.io.IOException;
public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\ASUS\\Documents\\abc.txt");
		System.out.println(file.exists());
		//file.createNewFile();//create file
		file.mkdir();// create folder
		System.out.println(file.exists());


	}

}
