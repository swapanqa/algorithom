package com.java.algorithom.complex_algorithom;

public class AmstrongNumber {
	
	//153
	//1*1*1*=1
	//5*5*5*=125
	//3*3*3=27
	//1+125+27=153
	
	//407==4*4*4+0+7*7*7=407
	//0
	//1==1*1*1=1
	//370,371
	
	
	public static void isArmstrongNumber(int num) {
		
		//153 == 1*1*1 5*5*5 3*3*3
		
		int cube = 0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r=num%10;     //get last number 3
			num = num/10;
			cube = cube +(r*r*r);
		}
		if(t == cube) {
			System.out.println("This is an armstrong number");
		}else {
			System.out.println("This is not an armstrong number");
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(134);
		isArmstrongNumber(1);
		isArmstrongNumber(370);
		

	}

}
