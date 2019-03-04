package com.program.practice;

public class VowelCount {

	public static void main(String[] args) {
String s = "aaaabbbbbzzzzzAAAAAA";
int vow=0;
int cons=0;
for (int i = 0; i < s.length(); i++) {
	char ch = s.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		vow++;
	}
	else {
		cons++;
	}
}
System.out.println("vowels"+vow);
System.out.println("cons"+cons);

	}

}
