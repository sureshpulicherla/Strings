package practice;

public class RemovingSameCharInString {

	public static void main(String[] args) {
		String s = "hello";
		char[] crr = s.toCharArray();
		for(int i=0;i<crr.length-1;i++) {
			if(crr[i+1] == crr[i+1]) {
				crr[i] =(char) (crr[i+1]-1);
			}
			System.out.print(crr[i+1]);
		}
	
	}

}