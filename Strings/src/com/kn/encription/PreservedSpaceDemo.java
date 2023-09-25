package com.kn.encription;

import java.util.Scanner;

public class PreservedSpaceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking inputs
		System.out.println("Enter a string");
		String inputString = scan.nextLine();
		
		// object creation
		PreservedSpace reverseString = new PreservedSpace();
		// method call
		reverseString.revStringWithSpace(inputString);
		// release resources
		scan.close();
	}

}
