package com.srm.javafullstack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readandwriteOrderFile {

	public static void main(String[] args) throws IOException {
		       
           FileReader fr = new FileReader("C:\\Users\\user\\Documents\\file1.txt");
           FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\file2.txt");
           String str = "";
           int i;
           while ((i = fr.read()) != -1) {
           str += (char)i;
           }
           System.out.println(str);
           fw.write(str); 
           fr.close();
           fw.close();
           System.out.println("FILE HAS BEEN READ AND WRITTEN !!");
       } 
	}
