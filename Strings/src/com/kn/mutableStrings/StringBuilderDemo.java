package com.kn.mutableStrings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Ram");
		sb1.append("Sita");
		System.out.println("Data = "+sb1);
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
	}

}
