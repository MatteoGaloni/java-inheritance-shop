package org.lessons.java.shop;

public class Headphones extends Product{
    //ATTRIBUTES
    private String color;
    private boolean isWireless;

    //CONSTRUCTORS

    public Headphones(String name, String description, double price, int vat, String color, boolean isWireless) {
        super(name, description, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    //METHODS
    //getter

    public String getColor() {
        return color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + getColor() + " Wireless: " + isWireless();
    }

    @Override
    public double getDiscount(boolean isPremium) {
        double fullPrice = getFullPrice();
        if (isPremium && !isWireless() ) {
            fullPrice *= 0.93;
        }
        return fullPrice;
    }
}
