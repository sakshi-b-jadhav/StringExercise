package com.prowings.stringpractice;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if(isAnagram(str1,  str2))
			System.out.println("given strings anagrams!!");
				else
				System.out.println("given strings are not anagrams!!");
	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() == str2.length()) {
			
			char[] firstWord = str1.toCharArray();
            char[] secondWord= str2.toCharArray();
            for (int i = 0; i < firstWord.length; i++) {
				for (int j = 0; j < secondWord.length; j++) {
					
						if(firstWord[i] == secondWord[j])

						{
							secondWord[j] = ' ';
							break;
						}
				}
            }
				for (int i= 0; i< secondWord.length; i++) {
					
					if(secondWord[i] != ' ')
					
						return false;
					}
				return true;
			}
			
		return false;
	}



}

