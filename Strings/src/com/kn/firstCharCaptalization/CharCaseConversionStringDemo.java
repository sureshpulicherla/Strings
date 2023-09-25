package com.kn.firstCharCaptalization;

import java.util.Scanner;

public class CharCaseConversionStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking inputs from user 
		System.out.println("Enter a String");
		String inputString = scan.nextLine();
		//Creating object 
		StringCharConversion charConversion = new StringCharConversion();
		// return capitalize String
		String res = charConversion.upperCaseConversion(inputString);
		// Printing String 
		System.out.println(res);
		// Release resources
		scan.close();
	}

}
