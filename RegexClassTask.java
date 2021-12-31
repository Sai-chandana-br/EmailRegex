package com.email;

import java.util.Scanner;
import java.util.regex.*;

public class RegexClassTask {
	public static void main(String[] args) {
		
		//creation of scanner object to take input of regex and inputString 
		Scanner scan = new Scanner(System.in);
		String regex, inputString, input;
		
		//regex pattern
		regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		
		
		System.out.print(" Registration");
		System.out.println("\n======================");
		System.out.print("\nEnter Your Name :\n");
		input = scan.nextLine();
		System.out.print("\nEnter Your email : \n");
		inputString = scan.nextLine();
		
		//Output ( validate email and give corresponding output )
		Pattern mypattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher mymatcher= mypattern.matcher(inputString);
		if ( mymatcher.find() ) {
			System.out.println("Valid email id, Registration successful!!");
		} else {
			System.out.println("Please enter a valid email");
		}
		
		//Releasing resources.
		scan.close();
		
	}
}