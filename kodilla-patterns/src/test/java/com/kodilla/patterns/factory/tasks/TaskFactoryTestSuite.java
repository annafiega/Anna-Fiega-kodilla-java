package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shopping = factory.createTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //then
        Assert.assertEquals("do shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task painting = factory.createTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //then
        Assert.assertEquals("paint the picture", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task driving= factory.createTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //then
        Assert.assertEquals("go to", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
