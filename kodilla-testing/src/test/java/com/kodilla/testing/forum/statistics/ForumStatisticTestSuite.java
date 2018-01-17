package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {

    @Test
    //post count 0
    public void testCalculateAdvStatistics1(){
        Statistics statisticsMock=mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 20; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(0, forumStatistic.numberOfPosts);
        Assert.assertEquals(10, forumStatistic.numberOfComments);

    }


    @Test
    public void testCalculateAdvStatistics2(){
        Statistics statisticsMock=mock(Statistics.class);
        //ForumStatistic forumStatistic=new ForumStatistic(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 20; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);
        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(1000, forumStatistic.numberOfPosts);
        Assert.assertEquals(2000, forumStatistic.numberOfComments);
    }
}
