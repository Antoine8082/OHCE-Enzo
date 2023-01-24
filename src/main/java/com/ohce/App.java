package com.ohce;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Entrez un mot :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println("Miroir :");
        System.out.println(reversed);
    }
}