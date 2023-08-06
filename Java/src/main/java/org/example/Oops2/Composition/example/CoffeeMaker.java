package org.example.Oops2.Composition.example;

public class CoffeeMaker {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        System.out.println("Preparing Coffee...");
    }
}
