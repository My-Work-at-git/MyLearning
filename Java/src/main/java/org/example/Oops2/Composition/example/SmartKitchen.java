package org.example.Oops2.Composition.example;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public Refrigerator getIceBox() {
        return iceBox;
    }
    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean cookFood,
                                boolean washDish,
                                boolean coffeeMaker) {
        iceBox.setHasWorkToDo(cookFood);
        dishWasher.setHasWorkToDo(washDish);
        brewMaster.setHasWorkToDo(coffeeMaker);
    }
    public void doKitchen(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
