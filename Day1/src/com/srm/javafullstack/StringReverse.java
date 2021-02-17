package com.srm.javafullstack;

import java.util.Scanner;

public class StringReverse {
	

	public void methreverse() {		 		
		String rev="";
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		if(len==0) {
			System.out.println("Empty string");
		}
		else {
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse ob = new StringReverse();
		ob.methreverse();
		
		
	}

}
