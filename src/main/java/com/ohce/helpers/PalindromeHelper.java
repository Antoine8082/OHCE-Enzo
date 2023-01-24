package com.ohce.helpers;

public class PalindromeHelper {

    public static String reverseString(String stringToReverse) {
        String reversed = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversed += stringToReverse.charAt(i);
        }
        return reversed;
    }


}
