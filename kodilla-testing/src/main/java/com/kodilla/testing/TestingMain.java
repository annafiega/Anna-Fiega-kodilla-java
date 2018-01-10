package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int sum = calculator.addAToB(3, 3);
        if (sum != 6) {
            System.out.println("test failed!");
        } else {
            System.out.println("Test ok");
        }

        int subtraction = calculator.substractAFromB(3, 3);
        if (subtraction != 0) {
            System.out.println("test failed!");
        } else {
            System.out.println("Test ok");
        }

    }
}



