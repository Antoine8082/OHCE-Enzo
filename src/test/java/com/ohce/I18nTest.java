package com.ohce;

import com.ohce.helpers.I18nHelper;
import org.junit.Assert;
import org.junit.Test;

public class I18nTest {
    @Test
    public void getMessageDefaultValue(){
        Assert.assertEquals("key.value", I18nHelper.getMessage("key.value"));
    }

    @Test
    public void getMessageValueWithLocal(){
        Assert.assertEquals("Bonne matinée.", I18nHelper.getMessage("enter.morning"));
    }
}
