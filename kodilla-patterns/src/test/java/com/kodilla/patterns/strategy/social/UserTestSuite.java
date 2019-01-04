package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //given
        User adam= new Millenials("Adam Nowak");
        User johan=new YGeneration("Johan Nowak");
        User amelia=new ZGeneration("Amelia Nowak");
        //when
        String adamUses =adam.sharedPost();
        System.out.println("Adam's favourites social media is " + adamUses);
        String johanUses =johan.sharedPost();
        System.out.println("Johan's favourites social media is " + johanUses);
        String ameliaUses=amelia.sharedPost();
        System.out.println("Amelia's favourites social media is "+ameliaUses);
        //then
        Assert.assertEquals("Facebook", adamUses);
        Assert.assertEquals("Twitter", johanUses);
        Assert.assertEquals("Snapchat", ameliaUses);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //given
        User adam= new Millenials("Adam Nowak");
        //when
        String adamUses =adam.sharedPost();
        System.out.println("Adam's favourite social media used to be the " + adamUses);
        adam.setSocialPublisher(new SnapchatPublisher());
        adamUses =adam.sharedPost();
        System.out.println("But now Adam uses " + adamUses);
        //then
        Assert.assertEquals("Snapchat", adamUses);
    }
}
