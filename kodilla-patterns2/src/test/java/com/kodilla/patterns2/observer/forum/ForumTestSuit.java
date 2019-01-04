package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumTestSuit {

    @Test

    public  void  testUpdate(){
        //Given
        ForumTopic javaHelpForum =new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone EScobar");
        ForumUser jessiePinkman= new ForumUser("Jessie Pinkman");

        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case");
        javaToolsForum.addPost("Help pls, my MYSql db doesn't wont to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("WhenI try to log in I got 'bad credentials' message" );

        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount() );
        assertEquals(5,jessiePinkman.getUpdateCount() );
    }
}
