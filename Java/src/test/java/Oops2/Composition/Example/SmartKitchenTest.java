package Oops2.Composition.Example;

import org.example.Oops2.Composition.example.SmartKitchen;

public class SmartKitchenTest {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
        kitchen.getDishWasher().doDishes();
        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchen();
    }
}
