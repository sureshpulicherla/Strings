package com.kn.stringReversingWithSpace;

public class StringReverse {
	public void reverseString(String inputString) {
		
		String[] srr = inputString.split(" ");
		StringBuffer sb= new StringBuffer();
		for(String s : srr) {
			char[] crr = s.toCharArray();
			for(int i=crr.length-1;i>=0;i--) {
				System.out.print(crr[i]);
			}
			System.out.print(" ");
			String result = sb.toString();
			
			System.out.print(result.trim());
		}
	}
}
