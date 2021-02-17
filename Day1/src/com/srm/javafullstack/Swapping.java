package com.srm.javafullstack;

import java.util.Scanner;

public class Swapping {
	
public void methswap(int a, int b)
{
	a=a+b;    
	b=a-b;    
	a=a-b;
	System.out.println("AFTER SWAPPING");
	System.out.println("Number 1: "+a);
	System.out.println("Number 2: "+b);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter First Number ");
			int num1=sc.nextInt();
			System.out.println("Enter Second Number ");
			int num2=sc.nextInt();
			Swapping ob= new Swapping();
			ob.methswap(num1,num2);
		}
	catch(Exception e) 
	{
			System.out.println("INVALID INPUT TYPE " +e);
	}
	}

}
