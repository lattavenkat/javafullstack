package com.srm.javafullstack;

import java.util.Scanner;

public class Factorial {
public void methfact() {
	int i,fact=1;  
	System.out.println("Enter a number: ");
	Scanner sc= new Scanner(System.in);
	int number=sc.nextInt();    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of " +number+ " is: " +fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial ob = new Factorial();
		ob.methfact();
	}

}
