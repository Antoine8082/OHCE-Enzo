package com.ohce;
import com.ohce.helpers.ConsoleHelper;
import com.ohce.helpers.PalindromeHelper;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ConsoleHelper.log("enter.hello");
        ConsoleHelper.log("enter.word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        String reverseWord = PalindromeHelper.reverseString(word);
        System.out.println("-> " + reverseWord + " <-");

        if(PalindromeHelper.isPalindrome(word)) {

            ConsoleHelper.log("good.word");
        }
        else{

            ConsoleHelper.log("bad.word");
        }

         ConsoleHelper.log("exit.byebye");
    }
}