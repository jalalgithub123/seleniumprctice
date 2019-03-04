package com.program.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "wonderful";
String res="";
for(int i=s.length()-1;i>=0;i--) {
	char c = s.charAt(i);
	res=res+c;
}
System.out.println(res);
	}

}
