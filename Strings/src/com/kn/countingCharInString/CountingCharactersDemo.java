package com.kn.countingCharInString;

import java.util.Scanner;

public class CountingCharactersDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String iputString = scan.nextLine();
		
		CountingCharacters charCount = new CountingCharacters();
		
		charCount.countingCharecters(iputString);
		
		scan.close();
			
	}
	

}
