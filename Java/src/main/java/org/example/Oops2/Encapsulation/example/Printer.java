package org.example.Oops2.Encapsulation.example;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer (int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel < 100 && tonerLevel > 0) ? tonerLevel : -1;
    }
    public int addToner (int tonerAmount) {
            int tonerGuide = tonerAmount + tonerLevel;
            if (tonerGuide < 0 || tonerGuide > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;
    }
    public int printPages (int pages) {
        int jobPages = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += jobPages;
        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
