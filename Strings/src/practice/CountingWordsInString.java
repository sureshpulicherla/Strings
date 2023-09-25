package practice;

import java.util.Scanner;

public class CountingWordsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input taking from user
		System.out.println("Enter the String");
		String inputString = scan.nextLine();
		String[] srr=inputString.split(" ");
		System.out.println(srr.length);
		
		scan.close();
	}

}
