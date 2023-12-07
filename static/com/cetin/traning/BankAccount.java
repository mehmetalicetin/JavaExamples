package com.cetin.traning;

import java.math.BigDecimal;

public class BankAccount {
    static String bankName;
    static String branchName;
    static String ifcs;

    long accountNumber;
    String accountHolderName;
    BigDecimal balance;

    static void setBankDetails(String bName, String brName, String _ifcs){
        bankName = bName;
        branchName = brName;
        ifcs = _ifcs;
    }

    void setAccountDetails(long accountNumber, String accountHolderName, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    static void bankName(){
        System.out.println("Bank Name:"+ bankName);
    }

    static void branchName(){
        System.out.println("Branch Name:"+branchName);
    }

    static void ifcs(){
        System.out.println("Ifcs:"+ifcs);
    }

    void deposit(BigDecimal balance){
        this.balance = this.balance.add(balance);
    }

    void withdraw(BigDecimal balance){
        this.balance = this.balance.subtract(balance);
    }

    void display(){
        System.out.println("Bank Name:\t\t"+ bankName);
        System.out.println("Branch Name:\t\t"+branchName);
        System.out.println("Ifcs:\t\t"+ifcs);
        System.out.println("Account Number:\t\t"+ this.accountNumber);
        System.out.println("Account Holder Name:\t\t"+this.accountHolderName);
        System.out.println("Balance:\t\t"+this.balance);
    }

}
