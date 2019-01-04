package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(3.3, 1.8);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("I caught:" + e);
        }finally{
            System.out.println("The process is over.");
        }
    }
}

