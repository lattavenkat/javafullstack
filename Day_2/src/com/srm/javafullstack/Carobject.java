//
package com.srm.javafullstack;

import java.util.Scanner;

public class Carobject {
	String brand,body_style,car_segment,car_fuel,size,purpose;
	Scanner sc = new Scanner(System.in);
	public Carobject() {
		
		System.out.println("...CAR DETAILS... ");
		System.out.println("Enter the CAR BRAND: ");
		brand=sc.nextLine();
		System.out.println("Enter the car BODY STYLE: ");//sedan,pickup trucks,couple,crossover,
		body_style=sc.nextLine();
		
		System.out.println("Enter the CAR SEGMENT: ");//compact car,luxury,compact, race
		car_segment=sc.nextLine();
		System.out.println("Enter the CAR FUEL: ");//diesel,electric,hydrogen
		car_fuel=sc.nextLine();
		System.out.println("Enter the CAR SIZE: ");//micro,midsize,large,compact
		size=sc.nextLine();	
	}
	public void brakecondition() {		 
		
		System.out.println("Enter thickness of your brake pad: ");
		float pad=sc.nextFloat();
		
		if(pad<0.635) {
		 System.out.println("you must replace your brake pad");	
		}
		else
		{
			 System.out.println("your brake is in good condition");	
		}
	}	
	public void service() {
		System.out.println("Enter kms travelled: ");
		float km=sc.nextFloat();
		if(km>10000) {
			System.out.println("Time to service!");
		}
	}
	void getDetails() {
		System.out.println("Enter the CAR BRAND: " + brand);
		System.out.println("Enter the car BODY STYLE: " + body_style);
		System.out.println("Enter the CAR SEGMENT: " + car_segment);
		System.out.println("Enter the CAR FUEL: " + car_fuel);
		System.out.println("Enter the CAR SIZE: " + size);
	}
	
	public static void main(String[] args) {			
		Carobject ob = new Carobject();
		ob.getDetails();		
		ob.brakecondition();
		ob.service();
	}

}
