package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your name in order to create a new bank-account");
    String name = scan.nextLine();
    Account user = new Account(name);
    String choice = "";
    boolean isExit = false;

    System.out.println(choice);

    while(!isExit){
    System.out.println("Withdraw-> Press -w- \nDeposit-> Press -d-\nExit-> Press -e-" );
    choice = scan.nextLine();
    if (choice.equals("w")){
        System.out.println("Withdraw Amount?");
        double withdrawAmount = Double.parseDouble(scan.nextLine());
        user.withdrawAmount(withdrawAmount);
        System.out.println(user.getBalance());
    } else if (choice.equals("d")) {
        System.out.println("Deposit Amount?");
        double depositAmount = Double.parseDouble(scan.nextLine());
        user.depositAmount(depositAmount);
        System.out.println(user.getBalance());
    } else if (choice.equals("e")) {
            System.out.println("Goodbye");
            isExit = true;
    } else {
            System.out.println("Please select a valid option!");
    }


    }
//
//    System.out.println(user.getAccountInfo());


    scan.close();
    }
}
