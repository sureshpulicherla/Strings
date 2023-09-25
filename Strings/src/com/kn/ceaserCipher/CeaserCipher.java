package com.kn.ceaserCipher;

public class CeaserCipher {
	public String encription(String inputString,int size) {
		
		char[]  crr = inputString.toCharArray();
		for(int i=0;i<crr.length;i++) {
			if(crr[i]>=65 && crr[i]<=90) {
				if(crr[i]+size<=90) {
					crr[i] = (char)(crr[i]+size);
				}else if(crr[i]+size>90) {
					crr[i] = (char)(crr[i]-26+size);
				}
			}
			else if (crr[i]>=97 && crr[i]<=122) {
				if(crr[i]+size<=122) {
					crr[i] = (char)(crr[i]+size);
				}else if(crr[i]+size>122) {
					crr[i] = (char)(crr[i]-26+size);
				}
			
		}
		}
		String outputString = new String(crr);
		System.out.println(outputString);
		return outputString;
	
}
}
