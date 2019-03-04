package com.program.practice;

public class Print100arm {
public static void main(String[] args) {
	for (int k = 1; k <= 1000; k++) {
int i=0,j=0;
int a=k;
int temp=0;
temp=a;
while(a>0) {
	i=a%10;
	j=j+(i*i*i);
	a=a/10;
}
if(temp==j) {
	System.out.println("No is armstrong"+j);
}
	}
}
}
