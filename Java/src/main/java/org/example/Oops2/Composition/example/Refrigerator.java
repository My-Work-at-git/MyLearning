package org.example.Oops2.Composition.example;

public class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo == true) {
            System.out.println("Order preparing....");
        }
    }
}
