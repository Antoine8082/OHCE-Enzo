package com.ohce;
import com.ohce.helpers.PalindromeHelper;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Entrez un mot :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        System.out.println("Miroir :");
        System.out.println(PalindromeHelper.reverseString(word));
    }
}