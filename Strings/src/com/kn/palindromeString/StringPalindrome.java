package com.kn.palindromeString;

public class StringPalindrome {
	public boolean stringPalindrome(String inputString) {
		
		char[] crr= inputString.toCharArray();
		StringBuffer sb = new StringBuffer("");
		for(int i=crr.length-1;i>=0;i--) {
			sb = sb.append(crr[i]);
		}
		
		
		
		
		
		
		
		
		return true;
	}

}
