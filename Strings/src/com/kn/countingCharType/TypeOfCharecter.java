package com.kn.countingCharType;

public class TypeOfCharecter {
	public void typeOfChar(String inputString) {
		char[] crr = inputString.toCharArray();
		upperVowelConsonants(crr);
		lowerVowelConsonants(crr);
		digits(crr);
		space(crr);
		specialCharacter(crr);
	}
	
	
	
	public void upperVowelConsonants(char[] crr) {
		int upperCount=0;
		int upperVowels =0;
		int upperConsonants = 0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] >=65 && crr[i]<=90) {
				upperCount++;
				if(crr[i]=='A' ||crr[i]=='E' ||crr[i]=='I' ||crr[i]=='O' ||crr[i]=='U') {
					upperVowels++;
				}else {
					upperConsonants++;
				}
			}
		}
		System.out.println("Upper Char = "+upperCount);
		System.out.println("Upper vowels = "+upperVowels);
		System.out.println("Upper Consonants = "+upperConsonants);
		
	}
	public void lowerVowelConsonants(char[] crr) {
		int lowerCount=0;
		int LowerVowels =0;
		int LowerConsonants = 0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] >=97 && crr[i]<=122) {
				lowerCount++;
				if(crr[i]=='a' ||crr[i]=='e' ||crr[i]=='i' ||crr[i]=='o' ||crr[i]=='u') {
					LowerVowels++;
				}else {
					LowerConsonants++;
				}
			}
		}
		System.out.println("LOWER Char = "+lowerCount);
		System.out.println("LOWER vowels = "+LowerVowels);
		System.out.println("LOWER consonants = "+LowerConsonants);
	}
	
	public void digits(char[] crr) {
		int DigitCount=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] >=48  && crr[i]<=57) {
				DigitCount++;
			}
		}
		System.out.println("Digit count = "+DigitCount);
	}
	public void space(char[] crr) {
		int SpaceCount=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] == 32) {
				SpaceCount++;
			}
		}
		System.out.println("Space count = "+SpaceCount);
	}
	public void specialCharacter(char[] crr) {
		int SpecialCharacter=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i] >=33 && crr[i]<=47 || crr[i]>=58 && crr[i]<=64 || crr[i]>=91 && crr[i]<=96 || crr[i]>=123 && crr[i]<=126) {
				SpecialCharacter++;
			}
		}
		System.out.println("SpecialCharacter = "+SpecialCharacter);
	}
	
}
