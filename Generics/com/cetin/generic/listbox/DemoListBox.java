package com.cetin.generic.listbox;

public class DemoListBox {
    public static void main(String[] args) {
        ListBox<String> stringListBox = new ListBox<>();
        stringListBox.add("Ali");
        stringListBox.add("Veli");

        stringListBox.printListBox(stringListBox);
    }
}
