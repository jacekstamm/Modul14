package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TasksQueue grzegorzB = new TasksQueue("Grzegorz Bąkowski");
        TasksQueue majaT = new TasksQueue("Maja Turowska");
        TasksQueue jacekZ = new TasksQueue("Jacek Zając");
        TasksQueue ewelinaG = new TasksQueue("Ewelina Góra");

        Mentor patrykC = new Mentor("Patryk Czekajski");
        Mentor janK = new Mentor("Jan Król");

        grzegorzB.registerObserver(patrykC);
        grzegorzB.registerObserver(janK);
        majaT.registerObserver(patrykC);
        jacekZ.registerObserver(janK);
        ewelinaG.registerObserver(patrykC);
        //When
        grzegorzB.addTask("Module 24.5 - Facade");
        grzegorzB.addTask("Module 24.6 - Builder");
        majaT.addTask("Module 16.1 - Spring");
        jacekZ.addTask("Module 1.2 - Java");
        ewelinaG.addTask("Module 28.6 - SQL");
        grzegorzB.addTask("Module 25.1 - Hibernate");

        //Then
        Assert.assertEquals(5, patrykC.getUpdateCount());
        Assert.assertEquals(4, janK.getUpdateCount());
    }
}
