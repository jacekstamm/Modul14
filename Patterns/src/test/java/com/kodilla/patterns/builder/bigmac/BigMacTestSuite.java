package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testShouldCreateBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredients("Cheese")
                .ingredients("Bacon")
                .ingredients("Chilli")
                .create();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
