package com.kn.waysToCompareString;

public class StringComparison3 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = s1;
		
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
	}

}
