package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString = scan.nextLine();
		//method creation
		reverseString(inputString);
		scan.close();
	}

	public static void reverseString(String inputString) {
		String[] srr = inputString.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");
		}
	}
	

}
