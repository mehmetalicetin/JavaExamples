package com.cetin.generic.methods;

import java.util.ArrayList;
import java.util.List;

public interface IMethodBox<T,U>{
    void add(T t, U u);
    void print(T t);
    U findById(T t, U u);
    boolean checkIfExist(T t, U u);
}
