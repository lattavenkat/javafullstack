package com.srm.javafullstack;

import java.util.Scanner;

public class Removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1 = str.replaceAll("\\s", "");
		   System.out.println(" String after removing whitespaces : "+str1);
		}
	}


