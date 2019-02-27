package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task", "Butter", 25.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting Task", "Blue", "Front Wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving Task", "Warsaw", "Train");
                default:
                    return null;
        }
    }
}
