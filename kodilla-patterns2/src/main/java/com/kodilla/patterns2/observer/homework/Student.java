package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements QueueObservable {

    private String name;
    private Queue<String>exercises;
    private final List<MentorObserver> observers;

    public Student(String name) {
        exercises= new ArrayDeque<>();
        observers= new ArrayList<>();
        this.name = name;
    }

    public  void  addHomework (String exercise){
        exercises.offer(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(MentorObserver observer) {
        observers.add(observer);
    }

    @Override
    public  void notifyObservers(){
        for(MentorObserver observer :observers ){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(MentorObserver observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public Queue<String> getHomeworkQueue() {
        return exercises;
    }
}
