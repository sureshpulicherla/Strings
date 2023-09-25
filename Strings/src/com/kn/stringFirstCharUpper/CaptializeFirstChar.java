package com.kn.stringFirstCharUpper;

public class CaptializeFirstChar {
	public String capitalizingFirstChar(String inputString) {
		String[] srr = inputString.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s : srr) {
			char[] crr = s.toCharArray();
			for(int i=0;i<crr.length;i++) {
				if(crr[0]>=97 && crr[0]<=122) {
					crr[0] = (char) (crr[0]-32);
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
