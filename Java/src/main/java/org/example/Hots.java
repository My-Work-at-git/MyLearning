package org.example;

public class Hots {
    public void returnInIfStatement(String string){
        System.out.println("If we provide a return statement in If it will stop the execution there");
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        System.out.println("I am not getting printed, if above condition is true");
    }
}
