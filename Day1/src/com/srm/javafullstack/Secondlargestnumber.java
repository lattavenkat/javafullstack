package com.srm.javafullstack;

import java.util.Arrays;
import java.util.Scanner;

public class Secondlargestnumber {
 static void methsln(int arr[],int arrsize) {
	int i;
	
	Arrays.sort(arr);
	for (i = arrsize - 2; i >= 0; i--) 
	  {
	    
	    if (arr[i] != arr[arrsize - 1]) 
	    {
	      System.out.printf("The second largest " + 
	                        "element is %d\n", arr[i]);
	      return;
	    }
	  }
	 
	  System.out.printf("There is no second " +
	                    "largest element\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondlargestnumber ob = new Secondlargestnumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		int n=sc.nextInt(); 
		int[] arr = new int[10];
		System.out.println("Enter the elements of the array: ");	
		if (n <=1) 
		  {
		    System.out.printf(" Invalid input! Enter atleast 2 numbers ");
		    return;
		  }
		for(int i=0; i<n; i++)  
		{  		
		arr[i]=sc.nextInt();  
		}  		  
		System.out.println("Array elements are: ");  
		  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(arr[i]);
		}
		int n1 = arr.length;
		  methsln(arr, n1);
	}}


