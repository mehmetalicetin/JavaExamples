package com.cetin.generic.listbox;

import java.util.*;

public class ListBox<T> extends ArrayList<T> {

    public void printListBox(ListBox<T> tListBox){
        tListBox.forEach(t -> displayListBox(t));
    }

    public void displayListBox(T t){
        System.out.println("One of the Box in list:"+t);
    }
}
