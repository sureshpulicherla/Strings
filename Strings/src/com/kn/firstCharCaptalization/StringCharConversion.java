package com.kn.firstCharCaptalization;

public class StringCharConversion {
	public String upperCaseConversion(String inputString) {
		String[] srr = inputString.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s : srr) {
			char[] crr = s.toCharArray();
			for(int i=0;i<crr.length;i++) {
				if(crr[i]>=97 && crr[i]<=122) {
					crr[i] = (char) (crr[i]+32);
				}
			}
			for(int i=0;i<crr.length;i++) {
				sb.append(crr[i]);
			}
			sb.append(" ");
		}
		String result = sb.toString();
		return result.trim();
	}
}
  