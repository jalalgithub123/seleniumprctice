package com.program.practice;

import java.util.Scanner;

public class EvenTest {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number%2==0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is odd");
	}
}
}
