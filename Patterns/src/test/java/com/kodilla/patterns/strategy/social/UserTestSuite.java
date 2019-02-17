package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User johnSmith = new Millenials("John Smith");
        User steveBranson = new YGeneration("Steve Branson");
        User jacekStamm = new ZGeneration("Jacek Stamm");
        //When
        String johnShare = johnSmith.sharePost();
        String steveShare = steveBranson.sharePost();
        String jacekShare = jacekStamm.sharePost();
        //Then
        Assert.assertEquals("Facebook", johnShare);
        Assert.assertEquals("Twitter", steveShare);
        Assert.assertEquals("Snapchat", jacekShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User johnSmith = new Millenials("John Smith");
        //When
        johnSmith.setSocialPublisher(new SnapchatPublisher());
        String johnShare = johnSmith.sharePost();
        //Then
        Assert.assertEquals("Snapchat", johnShare);
    }
}
