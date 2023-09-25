package com.kn.anagramString;

public class IsAnagramString {

	public boolean anagramString(String s1, String s2) {
		boolean isAnagram = false;
		if(s1.length() == s2.length()) {
			char[] crr1 = s1.toCharArray();
			char[] crr2 = s2.toCharArray();
			// sorting method call for crr1
			crr1 = sortingArray(crr1);
			//sorting method call for crr2
			crr2 = sortingArray(crr2);
			
			for(int i=0;i<crr1.length;i++) {
				if(crr1[i]!= crr2[i]) {
					isAnagram = false;
				}
			}
			isAnagram = true;
		}
		return isAnagram;
	}
	// method for sorting the array
	
	public char[] sortingArray(char[] crr) {
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					char temp = crr[j];
					crr[j] =crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		
		return crr;
	}
	
}