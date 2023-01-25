package com.ohce.helpers;

import java.time.LocalTime;
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
    public static String getPeriodsMessage(String prefixKey) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        String key = prefixKey;
        if (hour >= 6 && hour < 12) {
            key += ".morning";
        } else if (hour >= 12 && hour < 17) {
            key += ".afternoon";
        } else if (hour >= 17 && hour < 22) {
            key += ".evening";
        } else {
            key += ".night";
        }
        return getMessage(key);
    }
}
