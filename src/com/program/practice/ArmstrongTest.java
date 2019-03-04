package com.program.practice;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i=0,j=0;
System.out.println("Enter number to be checked for Armstrong");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
int temp=a;
while(a>0) {
	i=a%10;
	j=j+(i*i*i);
	a=a/10;
}
if(j==temp) {
	System.out.println("Armstrong"+j);
}
else {
	System.out.println("Not Armstrong"+j);
}
	}

}
