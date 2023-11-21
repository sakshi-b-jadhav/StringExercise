package com.prowings.stringpractice;

public class SubstringInString {
	

	    public static void main(String[] args) {
	        String mainString = "India is my country";
	        String subString = "is";

	        int indexOfSubstring = findFirstOccurrence(mainString, subString);

	        if (indexOfSubstring != -1) 
	        {
	            System.out.println("The first occurrence of the substring is at index: " + indexOfSubstring);
	        } else 
	        {
	            System.out.println("The substring is not found");
	        }
	    }

	    public static int findFirstOccurrence(String mainString, String subString) {
	    	
	    	 mainString.replaceAll(" ","");
	       
	    	return mainString.indexOf(subString);
	    }
	}



