package com.ohce.helpers;

public class PalindromeHelper {

    public static String reverseString(String stringToReverse) {
        String reversed = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversed += stringToReverse.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String word) {
        int i=0;
        int longueur = word.length() - 1;

        boolean isPalindrome = true;

        while( i < longueur / 2 && isPalindrome){
            if(word.charAt(i) != word.charAt(longueur-i)) {
                isPalindrome = false;
            }
            i++;
        }
        return isPalindrome;
    }

}
