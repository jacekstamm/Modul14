package com.kodilla.patterns2.observer.forum;

import static org.junit.Assert.*;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with foor loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, MySQL db doesn't want to work :(");
        javaHelpForum.addPost("While while? is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad creditials' message.");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
