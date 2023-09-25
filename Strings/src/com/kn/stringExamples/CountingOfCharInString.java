package com.kn.stringExamples;

import java.util.Scanner;

public class CountingOfCharInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s = scan.nextLine();
		s.split(" ");
		// vowels counting
		CountingStringChar countingString= new CountingStringChar();
		countingString.vowelCounting(s);
		countingString.countingNumbersInString(s);
		countingString.SpecialCharInString(s);
		countingString.consonentsInString(s);
		
		scan.close();
	}

}
