package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShouldCheckShoppingTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("Shopping Task", task.getTaskName());
    }

    @Test
    public void testShouldCheckDrivingTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("Driving Task", task.getTaskName());
    }

    @Test
    public void testShouldCheckPaintingName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTINGTASK);
        task.executeTask();
        //Then
        Assert.assertEquals("Painting Task", task.getTaskName());
    }
}
