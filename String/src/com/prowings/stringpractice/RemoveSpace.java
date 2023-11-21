package com.prowings.stringpractice;

public class RemoveSpace {
	public static void main(String[] args) {

		String s = "India is my  country";
		removeSpaces(s);
	}

	public static void removeSpaces(String s) {
		
	  s=s.replace(" ","");
	  System.out.println(s);

	}

}
