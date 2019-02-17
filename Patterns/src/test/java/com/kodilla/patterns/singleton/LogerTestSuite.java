package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LogerTestSuite {

    @Test
    public void testCheckLastLog() {
        //Given
        Logger.getInstance().log("Log Test");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log Test", result);
    }
}
