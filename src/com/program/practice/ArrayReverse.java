package com.program.practice;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,25,3,45,6};
int temp=0;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
}
	for (int i = 0; i < a.length; i++) {
		
	}
	System.out.println(a[a.length-5]);
	}

}
