package com.kn.stringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str1= "my name is suresh";
		String str2 = "sita";
		String str3 = "RAM";
		// string  data compare 
		System.out.println(str1 == str2);
		// string  
		System.out.println(str1.equals(str2));
		// string equalsIgnoreCase 
		System.out.println(str1.equalsIgnoreCase(str3));
		// UPPer case use to convert all into upper
		System.out.println(str1.toUpperCase());
		// Lower case use to convert all into lower
		System.out.println(str3.toLowerCase());
		// use to print index value
		System.out.println(str1.charAt(2));
		// printing char at which index number
		System.out.println(str2.indexOf('i'));
		// printing last char index number
		System.out.println(str1.lastIndexOf('d'));
		// it begins from the given index value
		System.out.println(str1.substring(2,5));
		// prints the string length
		System.out.println(str1.length());
		// check the given char start with same or not
		System.out.println(str1.startsWith("r"));
		// check the given char ends with same or not
		System.out.println(str1.endsWith("d"));
		// replace one char at a time
		System.out.println(str1.replace("r", "s"));
		// replace entire string to required string
		System.out.println(str1.replaceAll(str1,str2));
		//splitting the sentence with separated by ,
		System.out.println(Arrays.toString(str1.split(" ")));
		//Removes the spaces in the starting or Ending sides of the sentence
		System.out.println(str1.trim());
	}

}
