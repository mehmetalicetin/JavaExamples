package com.cetin.generic.methods;

import java.util.List;

public class NumberMethodBox<T extends List,U extends Number> implements IMethodBox<T,U>{
    @Override
    public void add(T t, U u) {
        t.add(u);
    }

    @Override
    public void print(T t) {
        t.forEach(value-> System.out.println("Value:"+value));
    }

    @Override
    public U findById(T t, U u) {
       return (U) t.stream().filter(x->u==x).findAny().get();
    }

    @Override
    public boolean checkIfExist(T t, U u) {
        return t.stream().filter(x->t.contains(u)).findAny().isPresent();
    }
}
