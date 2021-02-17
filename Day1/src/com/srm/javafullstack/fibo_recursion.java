package com.srm.javafullstack;

import java.util.Scanner;

public class fibo_recursion {
	static int a=0,b=1,c=0;
	static void methfibo(int num)
	{
	if(num>0)
	{
	c=a+b;
	a=b;
	b=c;
	System.out.println(" "+c);
	methfibo(num-1);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println(" "+a+" \n"+" "+b);
		methfibo(num-2);
	}

}
