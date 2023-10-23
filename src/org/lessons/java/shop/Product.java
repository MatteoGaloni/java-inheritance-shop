package org.lessons.java.shop;

import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.Random;

public class Product {
    //ATTRIBUTES
    private int referenceCode;
    private String name;
    private String description;
    private double price;
    private int vat;

//    aggiungo static per ampliare lo scope
//    private static int counter = 0;

/*
    variante con Bigdecimal
    **********************
    private BigDecimal myPrice;

    public BigDecimal getFullPrice(){
        return myPrice.add(myPrice.multiply(myVat)).setScale(2, RoundingMode.HALF_EVEN);
    }
*/

    private BigDecimal myVat;

    //CONSTRUCTORS
    public Product(String name, String description, double price, int vat) {
        Random randomGenerator = new Random();
        referenceCode = randomGenerator.nextInt(1,101);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    //METHODS
    //getter
    public int getReferenceCode() {
        return referenceCode;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getVat() {
        return vat;
    }

    //setter
//    public void setReferenceCode(int referenceCode) {
//        this.referenceCode = referenceCode;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    //Methods
    public double getFullPrice(){
       return price + (price * (vat / 100.00));
    }

    public String getFullName(){
        return referenceCode + "-" + name;
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() + " Description: " + getDescription() + " Full Price: " + getFullPrice() + " Vat: " + getVat();
    }

    public double getDiscount(boolean isPremium) {
        double fullPrice = getFullPrice();
        if (isPremium) {
            fullPrice *= 0.98;
        }
        return fullPrice;
    }




    //    private String getPaddedCode(){
//        String codeString = Integer.toString(referenceCode);
//        while (codeString.length() < 8){
//            codeString = "0" + codeString;
//        }
//        return codeString;
//
////        return String.format("%08d", code);
//    }

}
