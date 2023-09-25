package com.kn.countingCharType;

import java.util.Scanner;

public class CountingCharType {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter a sting ");
		String iputString = scan.nextLine();
		
		TypeOfCharecter charType = new TypeOfCharecter();
		
		charType.typeOfChar(iputString);
		scan.close();
	}

}
