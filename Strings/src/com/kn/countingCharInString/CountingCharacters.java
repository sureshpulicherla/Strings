package com.kn.countingCharInString;

public class CountingCharacters {
	public void countingCharecters(String iputString) {
		
		char[] crr =iputString.toCharArray();
		crr = sortingArray(crr);
//		System.out.println("---After sorting----");
//		for(char c : crr) {
//			System.out.print(c);
//		}System.out.println();
//		
		int count=1;
		for(int i=0;i<crr.length-1;i++) {
			if(crr[i] == crr[i+1]) {
				count++;
			}else {
				System.out.println(crr[i]+" occured in "+ count+ " times");
				count=1;
			}
			if(i+1 == crr.length-1) {
				System.out.println(crr[i+1]+" occured in "+ count+" times");
			}
		}
	}
	
	
	public char[] sortingArray(char[] crr) {
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		return crr;
	}
	
	
	
	
	
	
	
	
	
}
