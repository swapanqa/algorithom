package com.java.algorithom.complex_algorithom;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		int array [] = {-2,-1,0,1,2,3,4,6,7,8,9,10};
		
		int sum = 0;
		
		for(int i = 0; i<array.length;i++){
			sum = sum + array[i];
			
		}
		//System.out.println(sum);
		
		int sum1 = 0;
		
		for(int j = -2;j<=10;j++) {
			
			sum1 = sum1+j;
		}
		//System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}
