package com.kn.waysToCompareString;

public class StringComparison1 {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
		if(s1==s2) {
			System.out.println("Same Refference");
		}else {
			System.out.println("Different Refference");
		}
		if(s1.equals(s2)) {
			System.out.println("Same Data");
		}else {
			System.out.println("Different Data");
		}
		System.out.println("--------------");
		if(s3==s4) {
			System.out.println("Same Refference");
		}else {
			System.out.println("Different Refference");
		}
		if(s3.equals(s4)) {
			System.out.println("Same Data");
		}else {
			System.out.println("Different Data");
		}
	}
}
