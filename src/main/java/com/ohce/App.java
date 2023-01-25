package com.ohce;

import com.ohce.helpers.ConsoleHelper;
import com.ohce.helpers.PalindromeHelper;

public class App {
    public static void main(String[] args) {
        ConsoleHelper.temporalLog("enter");
        ConsoleHelper.log("enter.word");
        String word = ConsoleHelper.getInputLine();

        String reverseWord = PalindromeHelper.reverseString(word);
        System.out.println("-> " + reverseWord + " <-");

        if(PalindromeHelper.isPalindrome(word)) {
            ConsoleHelper.log("good.word");
        }
        else{
            ConsoleHelper.log("bad.word");
        }
        ConsoleHelper.temporalLog("exit");
    }
}

