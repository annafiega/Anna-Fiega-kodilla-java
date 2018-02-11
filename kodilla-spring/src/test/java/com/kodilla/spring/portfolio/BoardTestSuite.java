package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testGetToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //when
        board.getToDoList().getTasks().add("task 1");
        board.getInProgressList().getTasks().add("task 1");
        board.getDoneList().getTasks().add("task 1");
        //then
        Assert.assertEquals("task 1",board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task 1",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("task 1",board.getDoneList().getTasks().get(0));

    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
