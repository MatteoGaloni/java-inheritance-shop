package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Product{
    //ATTRIBUTES
    private int imei;
    private int gb;

    //CONSTRUCTORS
    public Smartphone(String name, String description, double price, int vat, int gb  ) {
        super(name, description, price, vat);
        Random randomGenerator = new Random();
        this.imei = randomGenerator.nextInt(10000000, 90000000);
        this.gb = gb;
    }

    //METHODS
    //getter

    public int getImei() {
        return imei;
    }

    public int getGb() {
        return gb;
    }

    //setter

    public void setGb(int gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {

        return super.toString() + " Imei: " + getImei() + " GB: " + getGb();
    }

    @Override
    public double getDiscount(boolean isPremium) {
        double fullPrice = getFullPrice();
        if (isPremium && getGb() < 32 ) {
            fullPrice *= 0.95;
        }
        return fullPrice;
    }
}
