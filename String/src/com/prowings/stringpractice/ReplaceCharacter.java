package com.prowings.stringpractice;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String s = "ababc";
		char replaceChar = 'a', replacedby = 'b';
		System.out.println(replaceCharacter(s, replaceChar, replacedby));
	}

	public static String replaceCharacter(String s, char replaceChar ,char replacedby ) {

		s = s.replace(replaceChar, replacedby);
		return s;
	}

}
