package com.kn.waysToCompareString;

public class StringComparison {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "sita";
		String s3 = "Ram"+"Sita";
		String s4 = "Ram"+"Sita";
		
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
