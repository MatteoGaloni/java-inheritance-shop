package org.lessons.java.shop;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Chart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items would you like to buy?");
        int quantity = Integer.parseInt(scan.nextLine());


        Product[] chart = new Product[quantity];
        double total = 0.0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("What would you like to buy? 1:Smarthphone - 2:Tv - 3:Headphones");
            int chosenProduct = Integer.parseInt(scan.nextLine());

            if (chosenProduct == 1 || chosenProduct == 2 || chosenProduct == 3) {
                System.out.println("Please enter productName: ");
                String productName = scan.nextLine();

                System.out.println("Please enter productDescription: ");
                String productDescription = scan.nextLine();

                System.out.println("Please enter productPrice: ");
                Double productPrice = Double.parseDouble(scan.nextLine());

                System.out.println("Please enter productVat: ");
                int productVat = Integer.parseInt(scan.nextLine());

                int gb = 0;
                int inches = 0;
                boolean isSmart = false;
                String color = "";
                boolean isWireless = false;

                if (chosenProduct == 1) {
                    System.out.println("Please enter GB: ");
                    gb = Integer.parseInt(scan.nextLine());
                    chart[i] = new Smartphone(productName, productDescription, productPrice, productVat, gb);

                } else if (chosenProduct == 2) {
                    System.out.println("Please enter Inches: ");
                    inches = Integer.parseInt(scan.nextLine());
                    System.out.println("Smart tv?: Enter: true or false");
                    isSmart = Boolean.parseBoolean(scan.nextLine());
                    chart[i] = new Tv(productName, productDescription, productPrice, productVat, inches, isSmart);

                } else {
                    System.out.println("Please enter Color: ");
                    color = scan.nextLine();
                    System.out.println("Is it wireless?: Enter true or false");
                    isWireless = Boolean.parseBoolean(scan.nextLine());
                    chart[i] = new Headphones(productName, productDescription, productPrice, productVat, color, isWireless);
                }

                total += chart[i].getVatPrice();

            } else {
                System.out.println("Invalid option");
                i--;
            }
        }

        for (Product product : chart) {
            System.out.println(product);
        }
        System.out.println(" Total: " + total + " €");


        scan.close();
    }


}
