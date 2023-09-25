package practice;

import java.util.Scanner;

public class LengthCharInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking input from user
		
		System.out.println("Enter a String");
		String iputString = scan.nextLine();
		
		System.out.println("Length of String is : "+iputString.length());
		
		scan.close();
	}
}
