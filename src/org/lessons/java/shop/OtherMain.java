package org.lessons.java.shop;

public class OtherMain {
    public static void main(String[] args) {
        Product laptop = new Product("laptop-MSI", "A laptop, sometimes called a notebook computer by manufacturers, is a battery- or AC-powered personal computer (PC) smaller than a briefcase. A laptop can be easily transported and used in temporary spaces such as on airplanes, in libraries, temporary offices and at meetings." , 500.00, 22 );

        Product iPad = new Product("iPad-mini", "t is a sub-series of the iPad line of tablets, with screen sizes of 7.9 inches and 8.3 inches. The first-generation iPad Mini was announced on October 23, 2012.", 355.99, 22 );

        Product food = new Product("eggs", "Eggs are a nutritious food laid by birds, commonly chickens. High in protein and versatile, they are a staple ingredient globally, used in various culinary applications.", 6.99, 10);

        Product[] ArrOfProducts = {laptop, iPad, food};

        for (Product product : ArrOfProducts) {
//            System.out.println("Full Name: " + product.getFullName() + " NetPrice: " + product.getVatPrice() + "€");
            System.out.println(product);
        }


    }

}
