package Oops2.Encapsulation.example;

import org.example.Oops2.Encapsulation.example.Printer;
import org.w3c.dom.ls.LSOutput;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
         int pagesPrinted  = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
        pagesPrinted  = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }
}
