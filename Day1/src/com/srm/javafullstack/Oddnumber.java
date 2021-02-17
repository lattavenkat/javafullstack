package com.srm.javafullstack;

import java.util.Scanner;

public class Oddnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);			
			System.out.print("Enter array elements ");
			int n=sc.nextInt();
			int[] arr = new int[n];
			int count=0;
			System.out.println("Odd Numbers:");
			for(int i=0;i<arr.length;i++)
			{  
				arr[i]=sc.nextInt();
			} 
			for(int i=0;i<arr.length;i++)
			{  
				if(arr[i]%2!=0){  
					System.out.println(arr[i]); 
					count++;
				}  
			} 
			if(count>=1)
			{
				System.out.println("ODD INTEGERS FOUND");
			}
			
	}
}



 
  