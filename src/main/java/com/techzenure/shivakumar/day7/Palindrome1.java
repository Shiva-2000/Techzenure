package com.techzenure.shivakumar.day7;

public class Palindrome1 {
	public static boolean Palindrome(String word) {
        String text = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = text.length();

        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
