package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver{

    private  final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public  void update(Student student){
        System.out.println("The mentor "+mentorName+ " received "+student.getHomeworkQueue().size() +" exercises to check from the student "+student.getName());
        updateCount++;

    }


    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
