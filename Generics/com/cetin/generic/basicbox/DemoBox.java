package com.cetin.generic.basicbox;

public class DemoBox {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("I am a string box.");
        stringBox.printBox();

        Box<Integer> integerBox = new Box<>(5);
        integerBox.printBox();
    }
}
