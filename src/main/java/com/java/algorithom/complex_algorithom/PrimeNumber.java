package com.java.algorithom.complex_algorithom;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int number) {
		
		for(int i =2;i<number/2;i++) {
			if(number == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(12));
		

	}

}
