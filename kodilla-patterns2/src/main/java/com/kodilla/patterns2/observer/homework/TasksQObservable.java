package com.kodilla.patterns2.observer.homework;

public interface TasksQObservable {
    void registerObserver(TasksQueueObserver tasksQueueObserver);
    void notifyObserver();
    void removeObserver(TasksQueueObserver tasksQueueObserver);
}
