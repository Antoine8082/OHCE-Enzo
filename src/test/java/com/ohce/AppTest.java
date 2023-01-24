package com.ohce;

import static org.junit.Assert.assertTrue;


import com.ohce.helpers.PalindromeHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
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

}