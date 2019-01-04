package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK="SHOPPING TASK";
    public static final String PAINTING_TASK="PAINTING TASK";
    public static final String DRIVING_TASK="DRIVING TASK";

    public Task createTask(final String taskClass){
        switch (taskClass){
            case SHOPPING_TASK:
                return new ShoppingTask("do shopping", "apple", 2.5);
            case PAINTING_TASK:
                return new PaintingTask("paint the picture", "blue", "sea");
            case DRIVING_TASK:
                return new DrivingTask("go to", "work", "bike");
            default:
                return null;
        }
    }
}
