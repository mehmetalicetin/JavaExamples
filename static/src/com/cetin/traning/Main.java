package com.cetin.traning;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount.setBankDetails("Finans","HCF","NPRS");
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        System.out.println("Bank Account 1 Details");
        bankAccount1.display();
        System.out.println("Bank Account 2 Details");
        bankAccount2.display();

        BankAccount.setBankDetails("Yapı Kredi","BTY","OPR");
        System.out.println("Bank Account 1 Details");
        bankAccount1.display();

        bankAccount1.setAccountDetails(1234L,"Ali", BigDecimal.valueOf(2500));

        System.out.println("Bank Account 1 Details");
        bankAccount1.display();

        bankAccount1.setBankDetails("TEB","TTB","RVB");

        System.out.println("Bank Account 2 Details");
        bankAccount2.display();


        bankAccount1.deposit(BigDecimal.valueOf(2000));
        System.out.println("Bank Account 1 Details");
        bankAccount1.display();
        System.out.println("Bank Account 1 Details");
        bankAccount2.display();
    }
}