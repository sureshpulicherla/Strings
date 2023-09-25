package com.kn.reversingTheWordOfString;

public class StringCharectersReverseing {

	public static void main(String[] args) {
		String s1 ="i love java";
		
		String[] srr = s1.split(" ");
		
		
		for(int i=0;i<srr.length;i++) {
			printCharInreverse(srr[i]);
		}
	}

	public static void printCharInreverse(String s1) {
		char[] crr = s1.toCharArray();
		for(int i=crr.length-1;i>=0;i--) {
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}

}
