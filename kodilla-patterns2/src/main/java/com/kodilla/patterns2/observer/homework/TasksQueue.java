package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements TasksQObservable {
    private final List<TasksQueueObserver> observers;
    private final Deque<String> tasks;
    private final String studentName;

    public TasksQueue(String studentName) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(TasksQueueObserver tasksQueueObserver) {
        observers.add(tasksQueueObserver);
    }

    @Override
    public void notifyObserver() {
        for (TasksQueueObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(TasksQueueObserver tasksQueueObserver) {
        observers.remove(tasksQueueObserver);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName
                ;
    }
}
