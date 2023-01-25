package com.ohce;

import java.util.Locale;
import com.ohce.helpers.I18nHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class I18nTest {

    private Locale defaultLocale;

    @Before
    public void saveDefaultLocale() {
        defaultLocale = Locale.getDefault();
    }

    @After
    public void restorDefaultLocale() {
        Locale.setDefault(defaultLocale);
    }

    @Test
    public void getMessageDefaultValue(){
        Assert.assertEquals("key.value", I18nHelper.getMessage("key.value"));
    }
    @Test
    public void getMessageValueWithEnLocale(){
        Locale enLocale = new Locale("en_EN");

        Locale.setDefault(enLocale);

        Assert.assertEquals("Hello.", I18nHelper.getMessage("enter.hello"));
    }

    @Test
    public void getMessageValueWithFrLocale(){
        Locale frLocale = new Locale("fr_FR");

        Locale.setDefault(frLocale);

        Assert.assertEquals("Bonjour.", I18nHelper.getMessage("enter.hello"));
    }
}
