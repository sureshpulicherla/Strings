package com.kn.stringExamples;

public class CountingStringChar {
	void vowelCounting(String s) {
		char[] crr = s.toCharArray();
		int count1=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u') {
				count1++;
			}
		}
		System.out.println("vowels = "+count1);
	}
		
	void consonentsInString(String s) {
			char[] crr = s.toCharArray();
			int count2=0;
			for(int i=0;i<crr.length;i++) {
			if(crr[i]!='a'&&crr[i]!='e'&&crr[i]!='i'&&crr[i]!='o'&&crr[i]!='u'&&crr[i] != '1'&&crr[i] != '2'&&crr[i] != '3'&&crr[i] != '4'&&crr[i] != '5'&&crr[i] != '6'&&crr[i] != '7'&&crr[i] != '8'&&crr[i] != '9'
				&&crr[i]!='!'&&crr[i]!='@'&&crr[i]!='#'&&crr[i]!='$'&&crr[i]!='%'&&crr[i]!='^'&&crr[i]!='*'&&crr[i]!='~') {
				count2++;
				}
			}System.out.println("Con = "+count2);	
	}
	
	void countingNumbersInString(String s) {
		char[] crr = s.toCharArray();
		int count = 0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]=='0'||crr[i]=='1'||crr[i]=='2'||crr[i]=='3'||crr[i]=='4'||crr[i]=='5'||crr[i]=='6'||crr[i]=='7'||crr[i]=='8'||crr[i]=='9') {
				count++;
			}
		}System.out.println("Numbers in String = "+count);	
	}

	void SpecialCharInString(String s) {
		char[] crr = s.toCharArray();
		int count = 0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]=='!'||crr[i]=='@'||crr[i]=='#'||crr[i]=='$'||crr[i]=='%'||crr[i]=='^'||crr[i]=='*'||crr[i]=='~') {
				count++;
			}
		}System.out.println("Special char in String = "+count);
	}
	
 

}
