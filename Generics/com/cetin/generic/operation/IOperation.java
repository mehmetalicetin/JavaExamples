package com.cetin.generic.operation;

import java.math.BigDecimal;
import java.util.List;

public interface IOperation<T extends  Number>{
    <U extends T> BigDecimal calculate(U number1, U number2);

    default void display(List<T> tlist) {
        tlist.forEach(System.out::println);
    }
}
