package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksQueueObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(mentorName + ": New task in Queue (" + tasksQueue.getTasks().getLast() + ") from: " + tasksQueue.getStudentName() + ".\nTotal in Queue: " + tasksQueue.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
