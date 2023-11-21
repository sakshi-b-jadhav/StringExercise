package com.prowings.stringpractice;

public class Paindrome {
	public static void main(String[] args) {

		String s = "radar";
		

		
		if(checkPalindromeString(s))
			System.out.println(s + ": is a palindrome");
		else
			System.out.println(s + ": is not palindrome");

	}

	public static boolean checkPalindromeString(String s) {
        String reverse = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
	  return s.equals(reverse);
	}
	
}


