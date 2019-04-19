package com.java.algorithom.complex_algorithom;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num = 456875989;
		long rev =0;
		
		while(num !=0) {
			
			rev = rev*10 + num % 10;
			
			num = num/10;
		}
		System.out.println("Reverse num is :" + rev);
		
		long num1 = 45678;
		
		//StringBuffer reverse = new StringBuffer();
		 
		
		//System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
