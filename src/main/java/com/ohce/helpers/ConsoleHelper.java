package com.ohce.helpers;

import java.util.Scanner;

public class ConsoleHelper {
    public static void log(String key) {
        System.out.println(I18nHelper.getMessage(key));
    }

    public static void temporalLog(String key) {
        System.out.println(I18nHelper.getPeriodsMessage(key));
    }

    public static String getInputLine() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        return word;
    }
}
