package practice;

import java.util.Scanner;

public class RemovingSpaceFromString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scan.nextLine();
		System.out.print(s.trim());
		scan.close();
	}

}
