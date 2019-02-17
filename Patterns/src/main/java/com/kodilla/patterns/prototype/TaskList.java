package com.kodilla.patterns.prototype;

import java.util.*;

public class TaskList {
    final private String name;
    final private List<Task> tasks = new ArrayList<>();

    public TaskList(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}