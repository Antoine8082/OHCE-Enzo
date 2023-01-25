package com.ohce.helpers;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class I18nHelper {
    public static String getMessage(String key) {

        Locale currentLocale = Locale.getDefault();
        try {
            ResourceBundle messages = ResourceBundle.getBundle("Messages", currentLocale);

            return messages.getString(key);
        } catch(MissingResourceException error) {
            return key;
        }
    }
    public static String getPeriodsMessage(String key) {
        return "";
    }
}
