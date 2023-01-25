package com.ohce.helpers;

public class ConsoleHelper {
    public static void log(String key) {
        System.out.println(I18nHelper.getMessage(key));
    }
}
