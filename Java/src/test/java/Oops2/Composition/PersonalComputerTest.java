package Oops2.Composition;


import org.example.Oops2.Composition.ComputerCase;
import org.example.Oops2.Composition.Monitor;
import org.example.Oops2.Composition.Motherboard;

public class PersonalComputerTest {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor monitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
    }
}
