package com.cetin.generic.operation;

import java.math.BigDecimal;

public class Addition<T extends Number> implements IOperation<T>{

    public Addition() {
    }
    @Override
    public <U extends T> BigDecimal calculate(U number1, U number2) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(number1.doubleValue());
        BigDecimal bigDecimal2 = BigDecimal.valueOf(number2.doubleValue());
        return bigDecimal1.add(bigDecimal2);
    }
}
