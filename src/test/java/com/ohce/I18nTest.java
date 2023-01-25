package com.ohce;

import java.time.LocalTime;
import java.util.Locale;
import com.ohce.helpers.I18nHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mockStatic;

@RunWith(MockitoJUnitRunner.class)
public class I18nTest {

    private Locale defaultLocale;

    @Before
    public void saveDefaultLocale() {
        defaultLocale = Locale.getDefault();
        Locale frLocale = new Locale("fr_FR");
        Locale.setDefault(frLocale);
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
        Assert.assertEquals("Bonjour.", I18nHelper.getMessage("enter.hello"));
    }
    @Test
    public void getPeriodsMessageAM() {
        LocalTime morning = LocalTime.now().withHour(8);
        MockedStatic<LocalTime> mockedStaticTime = mockStatic(LocalTime.class);
        mockedStaticTime.when(LocalTime::now).thenReturn(morning);
        Assert.assertEquals("Bonne matinée.", I18nHelper.getPeriodsMessage("enter"));

        mockedStaticTime.close();
    }

    @Test
    public void getPeriodsMessagePM() {
        LocalTime morning = LocalTime.now().withHour(14);
        MockedStatic<LocalTime> mockedStaticTime = mockStatic(LocalTime.class);
        mockedStaticTime.when(LocalTime::now).thenReturn(morning);
        Assert.assertEquals("Bon après-midi.", I18nHelper.getPeriodsMessage("enter"));

        mockedStaticTime.close();
    }

    @Test
    public void getPeriodsMessageEvening() {
        LocalTime morning = LocalTime.now().withHour(20);
        MockedStatic<LocalTime> mockedStaticTime = mockStatic(LocalTime.class);
        mockedStaticTime.when(LocalTime::now).thenReturn(morning);
        Assert.assertEquals("Bonsoir.", I18nHelper.getPeriodsMessage("enter"));

        mockedStaticTime.close();
    }

    @Test
    public void getPeriodsMessageNight() {
        LocalTime morning = LocalTime.now().withHour(0);
        MockedStatic<LocalTime> mockedStaticTime = mockStatic(LocalTime.class);
        mockedStaticTime.when(LocalTime::now).thenReturn(morning);
        Assert.assertEquals("Bonne nuit.", I18nHelper.getPeriodsMessage("enter"));

        mockedStaticTime.close();
    }
    // Un seul test pour la partie Anglaise est suffisant.
    @Test
    public void getPeriodsMessageEnNight() {
        Locale enLocale = new Locale("en_EN");
        Locale.setDefault(enLocale);
        LocalTime morning = LocalTime.now().withHour(0);
        MockedStatic<LocalTime> mockedStaticTime = mockStatic(LocalTime.class);
        mockedStaticTime.when(LocalTime::now).thenReturn(morning);
        Assert.assertEquals("Good night.", I18nHelper.getPeriodsMessage("enter"));

        mockedStaticTime.close();
    }
}
