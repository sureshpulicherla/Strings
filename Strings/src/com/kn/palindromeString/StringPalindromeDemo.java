package com.kn.palindromeString;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String inputString = scan.nextLine();
		
		StringPalindrome palindrome = new StringPalindrome();
		
		boolean b = palindrome.stringPalindrome(inputString);
		if(b) {
			System.out.println(inputString+" is palindrome");
		}else {
			System.out.println(inputString+" is not palindrome");
		}
		scan.close();
	}

}
