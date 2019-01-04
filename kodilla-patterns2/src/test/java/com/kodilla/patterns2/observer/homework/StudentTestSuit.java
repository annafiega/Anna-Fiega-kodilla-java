package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuit {
    @Test
    public void update(){
        //given
        Student student1=new Student ("student1");
        Student student2 =new Student ("student2");
        Student student3 =new Student("student3");
        Student student4 =new Student("student4");

        Mentor mentor1=new Mentor("Mentor1");
        Mentor mentor2=new Mentor("Mentor2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor1);
        student4.registerObserver(mentor2);

        student1.addHomework("homework");
        student1.addHomework("homework");
        student2.addHomework("homework");
        student3.addHomework("homework");
        student4.addHomework("homework");
        student1.addHomework("homework");
        student3.addHomework("homework");

        //then
        assertEquals(6, mentor1.getUpdateCount());
        assertEquals(1,mentor2.getUpdateCount());

    }



}
