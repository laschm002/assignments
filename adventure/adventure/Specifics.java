package adventure;

import java.util.Scanner;


public class Specifics {
	Scanner scanner = new Scanner (System.in);

	String choices;
	double price= 0;
	double budget = 0;
	double size = 0;
	int tier = 0;
	
	void cake (){
		System.out.println("Your desire for " + choices +  " reduces your budget to " + price  );
	}
}
	
	