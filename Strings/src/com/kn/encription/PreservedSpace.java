package com.kn.encription;

public class PreservedSpace {
	public void revStringWithSpace(String inputString) {
		char[] crr = inputString.toCharArray();
		char rrr[] =new char[crr.length];
		for(int i=0;i<crr.length;i++) {
				if(crr[i] == ' ') {
					rrr[i] = ' ';
			}
		}
		int n = 0;
		for(int i=crr.length-1 ;i>=0;i--) {
			if(crr[i]!=' '&& rrr[n] !=' ') {
				rrr[n] = crr[i];
			}else if(crr[i] != ' ' && rrr[n]==' ') {
				n++;
				rrr[n] = crr[i];
			}else if(crr[i]==' '&& rrr[n]!=' ') {
				i--;
				rrr[n] = crr[i];
			}
			n++;
		}
		for(char c : rrr) {
			System.out.print(c);
		}
		
		
	}
}
