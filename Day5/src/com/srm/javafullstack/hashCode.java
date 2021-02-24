package com.srm.javafullstack;

import java.io.File;
import java.io.IOException;

public class hashCode {

	public static void main(String[] args) throws IOException {		      
	        File f = new File("C:\\Users\\user\\Documents\\file.txt");
	         int hc = f.hashCode();
	         if(f.exists()) {
	            System.out.print("The hash code for the given file name is: " +hc);
	         }
	         else {
	        	 System.out.print("File not found");
	         }
	         
	}
	}

	


