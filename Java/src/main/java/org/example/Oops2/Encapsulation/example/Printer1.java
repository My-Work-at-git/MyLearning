package org.example.Oops2.Encapsulation.example;

public class Printer1 {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer1 (int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int tonerGuide = (tonerAmount + tonerLevel > 100) ? -1 : tonerAmount + tonerLevel;
            if (tonerGuide > -1) {
                return tonerLevel += tonerAmount;
            } else return tonerGuide;
        }else return -1;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        pagesToPrint = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted () {
        return pagesPrinted;
    }

}
