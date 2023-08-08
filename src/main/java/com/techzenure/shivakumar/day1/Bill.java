package com.techzenure.shivakumar.day1;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pizza = 100;
		int puffs = 20;
		int cool_drink = 10;
		Scanner sc =new Scanner(System.in); 
		System.out.print("enter the number of pizzas bought: ");
		int pizzas = sc.nextInt();
		
		
		System.out.print("enter the number of puffs bought:");
		int puff = sc.nextInt();
		
		
		System.out.print("enter the number of Cool Drinks bought:");
		int drink = sc.nextInt();
		
		
		
		System.out.println("Bill Details");
		System.out.println("No of Pizzas      :" + pizzas + "  			Cost: " + pizza  * pizzas);
		System.out.println("No of puffs       :" + puff + "  			Cost: " + puffs * puff);
		System.out.println("No of Cool Drinks :" + drink + "  			Cost: " + cool_drink * drink);
		System.out.println();
		float overAll = ((pizza  * pizzas) + (puffs * puff) + (cool_drink * drink));
		System.out.println("Total price = " + overAll);
		System.out.println("ENJOY THE SHOW!!!");
		sc.close();

	}

}
