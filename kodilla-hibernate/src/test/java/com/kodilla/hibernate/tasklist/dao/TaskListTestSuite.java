package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "NEXT YEAR";

    @Test
    public void testShouldFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "Tasks for the next Year");
        taskListDao.save(taskList);
        String listname = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listname);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        //CleanUo
        taskListDao.deleteAll();
    }
}
