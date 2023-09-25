package practice;

public class OddIndices {

	public static void main(String[] args) {
			String s= "programming";
			char[] crr =s.toCharArray();
			for(int i=0;i<crr.length-1;i+=2) {
				if(i% 2 == 0 ) {
					System.out.print(crr[i+1]+" ");
					
				}
			}
	}

}
