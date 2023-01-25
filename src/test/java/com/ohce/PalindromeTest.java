package com.ohce;

import com.ohce.helpers.PalindromeHelper;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

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
