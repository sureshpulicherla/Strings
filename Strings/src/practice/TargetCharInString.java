package practice;

import java.util.Scanner;

public class TargetCharInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking user from inputs
		System.out.println("Enter a string : ");
		String iputString = scan.nextLine();
		System.out.println("Enter the target char ");
		char c = scan.next().charAt(0);
		char crr[] = iputString.toCharArray();
		int count=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] == c) {
				count++;
			}
		}
		System.out.println(count);
		
		scan.close();
		
	}

}
