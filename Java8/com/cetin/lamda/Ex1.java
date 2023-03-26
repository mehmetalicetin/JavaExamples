package com.cetin.lamda;

public class Ex1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world1");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Hello world 2");
        }).start();

        new Thread(()-> System.out.println("Hello world3")).start();

        new Thread(()->print()).start();

        new Thread(ServiceRunnable::print).start();

        new Thread(ServiceCallable::operatorPlus).start();

    }

    public static void print(){
        System.out.println("Hello world !!");
    }
}
