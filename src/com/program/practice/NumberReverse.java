package com.program.practice;

import java.util.Scanner;

public class NumberReverse {
public static void main(String[] args) {
	int i=0,j=0;
	System.out.println("Enter number to be reversed");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	while(number>0) {
		i = number%10;
		j=(j*10)+i;
		number = number/10;
	}
	System.out.println(j);
}
}
