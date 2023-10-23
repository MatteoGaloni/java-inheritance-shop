package org.lessons.java.shop;

public class Tv extends Product{

    //ATTRIBUTES
    private int inches;
    private boolean isSmart;

    //CONSTRUCTORS
    public Tv(String name, String description, double price, int vat, int inches, boolean isSmart) {
        super(name, description, price, vat);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    //METHODS
    //getter
    public int getInches() {
        return inches;
    }

    public boolean isSmart() {
        return isSmart;
    }

    //setter

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
