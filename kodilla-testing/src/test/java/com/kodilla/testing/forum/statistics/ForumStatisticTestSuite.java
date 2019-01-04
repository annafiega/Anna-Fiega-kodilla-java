package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

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
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(0, forumStatistic.numberOfPosts);
        Assert.assertEquals(0, forumStatistic.numberOfComments);

    }


    @Test //post count 1000
    public void testCalculateAdvStatistics2(){
        Statistics statisticsMock=mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 20; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3258);
        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(1000, forumStatistic.numberOfPosts);
        Assert.assertEquals(3258, forumStatistic.numberOfComments);
    }

    @Test //comment count 0
    public void testCalculateAdvStatistics3(){
        Statistics statisticsMock=mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 20; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(45);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(45, forumStatistic.numberOfPosts);
        Assert.assertEquals(0, forumStatistic.numberOfComments);
    }

    @Test //comment count <post comment
    public void testCalculateAdvStatistics4(){
        Statistics statisticsMock=mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 20; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(45);
        when(statisticsMock.commentsCount()).thenReturn(40);

        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(20, forumStatistic.numberOfUsers);
        Assert.assertEquals(45, forumStatistic.numberOfPosts);
        Assert.assertEquals(40, forumStatistic.numberOfComments);
    }
    @Test //comment count >post comment
        public void testCalculateAdvStatistics5(){
            Statistics statisticsMock=mock(Statistics.class);
            ArrayList<String> usersList = new ArrayList<>();
            String user = "User ";
            for(int i = 1; i <= 20; i++) {
                user = user + i;
                usersList.add(user);
            }
            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(45);
            when(statisticsMock.commentsCount()).thenReturn(125);

            //when
            ForumStatistic forumStatistic = new ForumStatistic();
            forumStatistic.calculateAdvStatistics(statisticsMock);
            forumStatistic.showStatistics();

            //Then
            Assert.assertEquals(20, forumStatistic.numberOfUsers);
            Assert.assertEquals(45, forumStatistic.numberOfPosts);
            Assert.assertEquals(125, forumStatistic.numberOfComments);
    }
    @Test //users count 0
    public void testCalculateAdvStatistics6(){
        Statistics statisticsMock=mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(40);

        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(0, forumStatistic.numberOfUsers);
        Assert.assertEquals(0, forumStatistic.numberOfPosts);
        Assert.assertEquals(0, forumStatistic.numberOfComments);
    }
    @Test //comment count >post comment
    public void testCalculateAdvStatistics7(){
        Statistics statisticsMock=mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User ";
        for(int i = 1; i <= 100; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(45);
        when(statisticsMock.commentsCount()).thenReturn(125);

        //when
        ForumStatistic forumStatistic = new ForumStatistic();
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        //Then
        Assert.assertEquals(100, forumStatistic.numberOfUsers);
        Assert.assertEquals(45, forumStatistic.numberOfPosts);
        Assert.assertEquals(125, forumStatistic.numberOfComments);
    }

}
