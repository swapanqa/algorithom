package com.java.algorithom.complex_algorithom;

public class PalindromeNumber {
	
	//154 454 34543 161 78987
	
	public static void isPalindromeNumber(int num) {
		
		
		int reverse = 0;
		int sum = 0;
		int tem;
		
		tem = num;
		
		while(num>0) {
			
			reverse = num%10;   //get the remainder
			sum = (sum*10) + reverse;
			num = num/10;
			
		}
		if(tem == sum) {
			
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
