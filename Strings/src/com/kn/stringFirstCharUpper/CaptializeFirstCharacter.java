package com.kn.stringFirstCharUpper;

import java.util.Scanner;

public class CaptializeFirstCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking inputs from user 
		System.out.println("Enter a String");
		String inputString = scan.nextLine();
		//Creating object 
		CaptializeFirstChar capitalFirstChar = new CaptializeFirstChar();
		
		// return capitalize String
		String res = capitalFirstChar.capitalizingFirstChar(inputString);
		// Printing String 
		System.out.println(res);
		
		// Release resources
		scan.close();
	}

}
