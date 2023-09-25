package com.kn.gettingRomanNumbers;

import java.util.Scanner;

public class GettingRomanNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		
		String[] srr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int arr[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		
		StringBuffer romanNumber = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			while(num>=arr[i]) {
				num = num-arr[i];
				romanNumber.append(srr[i]);
			}
		}
		
		System.out.println(romanNumber);
		scan.close();
	}

}
