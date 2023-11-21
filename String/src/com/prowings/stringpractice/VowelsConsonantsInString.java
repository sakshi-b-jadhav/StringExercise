package com.prowings.stringpractice;

public class VowelsConsonantsInString {
	public static void main(String[] args) {

		String s = "eclipse workspace";

		countVowelsConsonants(s);
	}

	public static void countVowelsConsonants(String s) {
		
		int vowel = 0;
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			s = s.toLowerCase();

			char character = s.charAt(i);
			if (character >= 'a' && character <= 'z') {
				if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
					
					vowel++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println(vowel);
		System.out.println(consonants);
	}
}
