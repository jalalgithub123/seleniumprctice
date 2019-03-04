package com.program.practice;

import java.util.Scanner;

public class SumEven {
	static int sum =0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for (int i = 1; i < number; i++) {
		if(i%2==0) {
			sum = sum+i;
		}
		
	}
	System.out.println(sum);
}
}
