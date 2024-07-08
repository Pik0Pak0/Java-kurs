package com.robie.sobie.testing;

import com.robie.sobie.testing.calculator.Calculator;
import com.robie.sobie.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        //test 1
        SimpleUser SimpleUser = new SimpleUser("theForumUser");
        String result = SimpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test 2
        Calculator calculator = new Calculator(7,3);

        if(calculator.add()==10){
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        if(calculator.substrat()==4){
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
