package com.prowings.stringpractice;

public class ReverseString {
	public static void main(String[] args) {

		String str = "abc";
		System.out.println(reverseString(str));
		
		System.out.println(reverseString1(str));
	}

	public static String reverseString(String str) {
		
		char[] reverseStr=new char[str.length()];
		int count =0;
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseStr[count++]=str.charAt(i);	
		}
		return new String(reverseStr);	
	}
	
	public static String reverseString1(String str) {
	    String s = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	        s += str.charAt(i);
	    }
	    return new String(s);
	}
			
	
	
}
