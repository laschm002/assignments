package adventure;

import java.util.Scanner;



public class adventure {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Design your Wedding Cake");
		System.out.println("What is your budget?");
		
		double budget = scanner.nextDouble();
		
System.out.println("How many tiers do you want on your cake?");
		
		Specifics specifics1 = new Specifics();
		specifics1.tier = scanner.nextInt();
		specifics1.price = budget - 50;
		
		System.out.println("You want a " + specifics1.tier + "tier cake!");


System.out.println("What flavor sponge would you like?");
				
		Specifics specifics2 = new Specifics();
		specifics2.choices = scanner.next();
		specifics2.price = (specifics1.price = budget - 50)-25;
		specifics2.cake();


System.out.println("What type of filling would you like: vanilla, chocolate, or strawberry?");		
		String filling = scanner.next();
		
		switch(filling){
		case "vanilla":
			specifics2.price = (specifics1.price = budget - 50)-25;
			specifics2.cake();
			System.out.println("Vanilla is free of charge!");
			break;
		
		case "chocolate":
			specifics2.price = (specifics1.price = budget - 50)-25-30;
			specifics2.cake();
			System.out.println("Chocolate costs 10 dollars per tier");
			break;
		
		case "strawberry":
			specifics2.price = (specifics1.price = budget - 50)-25-36;
			specifics2.cake();
			System.out.println("Strawberry costs 12 dollars per tier");
			break;
			
			default:
				System.out.println("Please call the bakery");
				break;
		
		}
		
	}
		
}
		
	
		
		