package com.kn.ceaserCipher;

import java.util.Scanner;

public class CeaserCipherDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter the password");
		String inputString = scan.nextLine();
		System.out.println("Enter the size of jumping char");
		int size = scan.nextInt();
		
		// object creation
		CeaserCipher ceaserCipher = new CeaserCipher();
		ceaserCipher.encription(inputString, size);
		//release resources
		scan.close();
		
	}
}
