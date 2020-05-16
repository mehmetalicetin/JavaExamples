package com.cetin.lamda;

public class ServiceRunnable implements Runnable{
    @Override
    public void run() {
        print();
    }

    public static void print(){
        System.out.println("Hellor World ServiceRunnable !!");
    }
}
