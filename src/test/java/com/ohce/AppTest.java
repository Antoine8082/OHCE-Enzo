package com.ohce;

import static org.junit.Assert.assertTrue;

import com.ohce.helpers.I18nHelper;
import com.ohce.helpers.PalindromeHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    @Test
    public void reverseString() {
        Assert.assertEquals("kfj", PalindromeHelper.reverseString("jfk"));
    }
    @Test
    public void isPalindromeFalse() {
        Assert.assertFalse(PalindromeHelper.isPalindrome("jfk"));
    }

    @Test
    public void isPalindromeTrue() {
        Assert.assertTrue(PalindromeHelper.isPalindrome("ava"));
    }

    @Test
    public void getMessageDefaultValue(){
        Assert.assertEquals("key.value", I18nHelper.getMessage("key.value"));
    }

    @Test
    public void getMessageValueWithLocal(){
        Assert.assertEquals("Good morning.", I18nHelper.getMessage("enter.morning"));
    }
}