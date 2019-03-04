package com.program.practice;

import java.util.Scanner;

public class SumCount {
public static void main(String[] args) {
	int count=0;
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for(int i=1;i<number;i++) {
		if(i%2==0) {
			count++;
		}
	}
System.out.println(count);
}
}
