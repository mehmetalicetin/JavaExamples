package com.cetin.generic.methods;

import com.cetin.generic.listbox.ListBox;

import java.util.List;

public class DemoMethodBox {
    public static void main(String[] args) {
        integerMethodBox();
        doubleMethodBox();
    }

    private static void doubleMethodBox() {
        List<String> listBox = new ListBox<>();
        NumberMethodBox<List, Double> listDoubleNumberMethodBox = new NumberMethodBox<>();
        listDoubleNumberMethodBox.add(listBox,5.5);
        listDoubleNumberMethodBox.add(listBox,15.15);
        listDoubleNumberMethodBox.add(listBox,25.25);
        listDoubleNumberMethodBox.add(listBox,35.35);
        listDoubleNumberMethodBox.add(listBox,45.45);

        listDoubleNumberMethodBox.print(listBox);

        Double finding =  listDoubleNumberMethodBox.findById(listBox,45.45);
        System.out.println("Finding Number:"+finding);

        double number = 45.45;
        Boolean exist =  listDoubleNumberMethodBox.checkIfExist(listBox,number);
        if(exist)
            System.out.println("Number:"+number+" is exist in list");
    }

    private static void integerMethodBox() {
        List<Integer> listBox = new ListBox<>();
        NumberMethodBox<List, Integer> listIntegerNumberMethodBox = new NumberMethodBox<>();
        listIntegerNumberMethodBox.add(listBox,5);
        listIntegerNumberMethodBox.add(listBox,15);
        listIntegerNumberMethodBox.add(listBox,25);
        listIntegerNumberMethodBox.add(listBox,35);
        listIntegerNumberMethodBox.add(listBox,45);

        listIntegerNumberMethodBox.print(listBox);

        Integer finding =  listIntegerNumberMethodBox.findById(listBox,45);
        System.out.println("Finding Number:"+finding);

        int number = 45;
        Boolean exist =  listIntegerNumberMethodBox.checkIfExist(listBox,number);
        if(exist)
            System.out.println("Number:"+number+" is exist in list");
    }
}
