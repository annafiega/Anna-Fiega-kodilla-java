package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPain;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPain) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPain = whatToPain;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        taskExecuted=true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
