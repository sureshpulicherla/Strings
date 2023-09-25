package com.kn.anagramString;

import java.util.Scanner;

public class IsAnagramStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking inputs from user
		System.out.println("Enter first string");
		String s1 = scan.nextLine();
		System.out.println("Enter second string");
		String s2 = scan.nextLine();
		
		// object creation
		
		IsAnagramString	 anagram =  new IsAnagramString();
		
		// method calling
		boolean isAnagaram = anagram.anagramString(s1,s2);
		if(isAnagaram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		// release resources
		scan.close();
		
}


}

	
