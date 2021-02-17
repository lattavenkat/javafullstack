package com.srm.javafullstack;

import java.util.Scanner;

public class Primenumber {
	
	public void methprime() 
	{
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean prime=false;
		if(number<0) {
			System.out.println(number + "is not a valid number");
		}
		else if(number==0 || number==1) {
			System.out.println(number + " is not a Prime Number");
		}
		else {
			int val=number/2;
		for(int i=2;i<=val;i++) {
			if(val%i==0) {
				System.out.println(number + " is not a Prime Number");
				prime=true;	
				break;
			}
		}
		if(prime==false) {
				System.out.println(number + " is a Prime Number");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber ob = new Primenumber();
		ob.methprime();
	

	}

}
