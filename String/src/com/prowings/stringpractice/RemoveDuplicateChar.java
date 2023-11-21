package com.prowings.stringpractice;

import java.util.Arrays;
public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s = "ABBCDD";
		System.out.println(removeDuplicateChar(s));
	}
	public static String removeDuplicateChar(String s)
	{
		int count=0;
		char[] characters=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			characters[count]=s.charAt(i);
			count++;
		}
		for(int i=0;i<s.length();i++)
		{
			 for(int j=i+1;j<s.length();j++)
			 {
				 if(characters[i]==characters[j])
				 {
					 characters[j]=' ';
				 }
			 }
		}
		
		String result=new String(characters);
		result= result.replace(" ","");
		return result;
	}

}
