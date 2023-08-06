package org.example.Oops2.Composition.example;

public class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (hasWorkToDo == true) {
            System.out.println("Washing dish...");
        }
    }
}
