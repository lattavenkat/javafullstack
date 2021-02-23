package com.srm.javafullstack;

import java.util.Scanner;

public class Diamondproblem implements Fundtransfer  {
	public void transaction1() {
		String name,add;
		int accno,a,b,balance, total=50000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your Acc.no:");
		accno=sc.nextInt();
		System.out.println("Enter your Address:");
		add=sc.next();
		System.out.println("Enter the amount:");
		a=sc.nextInt();
		System.out.println("Your amount is withdrawn");
		balance=total-a;
		System.out.println("Balance amount is: "+ balance);
	}
	public void transaction2() {
		String name,add;
		int accno,amount;				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your Acc.no:");
		accno=sc.nextInt();
		System.out.println("Enter your Address:");
		add=sc.next();
		System.out.println("Enter the amount:");
		amount=sc.nextInt();
		if(amount>=500 && amount<=50000)
		{
		System.out.println("Your amount is deposited");
		}
		else
		{
		System.out.println(" 500 is your minimum deposit amount");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose your option:");
		System.out.println("1.WITHDRAW \n2.DEPOSIT");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		int i=sc.nextInt();
		Diamondproblem ob = new Diamondproblem();
		if(i==1) {
		ob.transaction1();
		}
		if(i==2) {
			ob.transaction2();	
		}		
	}
}
