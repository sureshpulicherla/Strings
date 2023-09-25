package com.kn.stringReversingWithSpace;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//taking user inputs from user
		System.out.println("Enter a String : ");
		String inputString = scan.nextLine();
		
		// Creating object for StringReverse class
		StringReverse stringRev = new StringReverse();
		
		// method call 
		stringRev.reverseString(inputString);
		
		// release resources
		
		scan.close();
		
	}

}

