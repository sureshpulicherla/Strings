package com.kn.reversingTheWordOfString;

public class StringReversing {

	public static void main(String[] args) {
		String s1 ="I am learning Arrays in java";
		
		String[] srr = s1.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");
		}
	}

}
