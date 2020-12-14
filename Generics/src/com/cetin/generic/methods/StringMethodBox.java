package com.cetin.generic.methods;

import com.cetin.generic.listbox.ListBox;

import java.util.List;

public class StringMethodBox<T extends List, U extends String> implements IMethodBox<T,U> {

    @Override
    public void add(T t, U u) {

    }

    @Override
    public void print(T t) {

    }

    @Override
    public U findById(T t, U u) {
        return null;
    }

    @Override
    public boolean checkIfExist(T t, U u) {
        return false;
    }
}
