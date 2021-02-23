package com.srm.javafullstack;

import java.util.Scanner;
class productship{
	private int prodid=0;
public void pricecalc() {
	double weight,qnty,price,basecost=0;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Product ID: ");
	prodid=sc.nextInt();
	System.out.println("Enter quantity of your product: ");
	qnty=sc.nextInt();				
	System.out.println("Enter weight of your product in kg: ");
	weight=sc.nextFloat();
	if(weight>200) {
		System.out.println("We dont accept package weighs more than 200kg");
	}
	else if(weight<=0 || qnty<=0)
	{
		System.out.println("Invalid input!Negative numbers not accepted\n-----------------");	
	}
	else if(weight >=150 || weight<=200 ) {
		basecost=15.95;
		System.out.println(".....BILL CALCULATION.....");
		System.out.println("WEIGHT IN KG: " +weight);
		System.out.println("QUANTITY: " +qnty);
		price =qnty*basecost;
		System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=100 || weight<150) {
		basecost=12.95;
		System.out.println(".....BILL CALCULATION.....");
		System.out.println("WEIGHT IN KG: " +weight);
		System.out.println("QUANTITY: " +qnty);
		price =qnty*basecost;
		System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=50 || weight<100) {
		basecost=9.95;
		System.out.println(".....BILL CALCULATION.....");
		System.out.println("WEIGHT IN KG: " +weight);
		System.out.println("QUANTITY: " +qnty);
		price =qnty*basecost;
		System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=30 || weight<50) {
		basecost=7.95;
		System.out.println(".....BILL CALCULATION.....");
		System.out.println("WEIGHT IN KG: " +weight);
		System.out.println("QUANTITY: " +qnty);
		price =qnty*basecost;
		System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=1 || weight<30) {
		basecost=4.95;
		System.out.println(".....BILL CALCULATION.....");
		System.out.println("WEIGHT IN KG: " +weight);
		System.out.println("QUANTITY: " +qnty);
		price =qnty*basecost;
		System.out.println("TOTAL COST: "+price);
	}	
	 	
	else {
		System.out.println("Invalid input!");		
	}
	}
}
public class ShipingModule {
	public static void main(String[] args) {
		String pname,from,to;		
		Scanner sc = new Scanner(System.in);
		System.out.println("PRODUCT SHIPPING");
		System.out.println("Enter Product name: ");
		pname=sc.nextLine();
		System.out.println("Where will you start from: ");
		from=sc.nextLine();
		System.out.println("Where do you want to sent it: ");
		to=sc.nextLine();	
		System.out.println("PRODUCT NAME: " +pname);
		System.out.println("FROM: " +from);
		System.out.println("TO: " +to);
		productship ob = new  productship();
		ob.pricecalc();
	}
	}

