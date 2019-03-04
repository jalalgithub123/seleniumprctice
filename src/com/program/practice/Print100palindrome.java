package com.program.practice;

public class Print100palindrome {
public static void main(String[] args) {
	for(int k=0;k<=100;k++) {
		int a=k,i=0,j=0;
		int temp=0;
		temp=a;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(temp==j) {		
		System.out.println("palindrome"+j);
	}

		else {
		System.out.println("Not palindrome"+j);	
		}
		}
	
}
}

