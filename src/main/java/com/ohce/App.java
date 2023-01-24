package com.ohce;
import com.ohce.helpers.PalindromeHelper;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Bonjour," + "\n" + "Entrez un mot et voyons si c'est un palindrome :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        String reverseWord = PalindromeHelper.reverseString(word);
        System.out.println("Résultat : " + reverseWord);

        if(PalindromeHelper.isPalindrome(word)) {
            System.out.println("Bien dit !");
        }
            else{
                System.out.println("Raté !");
            }


        System.out.println("Au revoir.");
    }
}