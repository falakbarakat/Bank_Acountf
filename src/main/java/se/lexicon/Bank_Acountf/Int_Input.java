package se.lexicon.Bank_Acountf;

import java.util.Scanner;

public class Int_Input {
	 	
	private static Scanner in = new Scanner (System.in);
	public static String getInput() {
       	return in.nextLine();

       	}

    public static int valid_number() {
       	boolean valid = false;
       	int number = 0;
       	while(!valid) {
       		try {
           		number = (int) Double.parseDouble(getInput());
           		valid = true;
           	}catch(NumberFormatException e) {
           		System.out.println("You did not enter a valid number");
           	}
       	}
       	return number;    	
       }


}
