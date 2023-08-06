package Oops2.Encapsulation.example;

import org.example.Oops2.Encapsulation.example.Printer1;

public class Printer1Test {
    public static void main(String[] args) {
        Printer1 printer = new Printer1(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

}