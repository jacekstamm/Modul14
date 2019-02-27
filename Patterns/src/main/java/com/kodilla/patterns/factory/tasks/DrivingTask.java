package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean taskStatus;

        public DrivingTask(final String taskName, final String where, final String using) {
            this.taskName = taskName;
            this.where = where;
            this.using = using;
        }


        @Override
    public void executeTask() {
            taskStatus = using.equals("Car") || using.equals("Airplane");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
