package com.program.practice;

public class FiboSeries {
public static void main(String[] args) {
	int a=0,b=1,c=1;
	for(int i=1;i<=100;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
System.out.println(c);
}
}
