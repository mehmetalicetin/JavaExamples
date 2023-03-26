package com.cetin.generic.operation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class Operation<T extends Number>{
   private IOperation operation;

    private Operation() {
    }

    public  static Operation getInstance(){
        return new Operation<>();
    }

    public OperationType selectOperation(short line){
        return Arrays.stream(OperationType.values()).filter(x->x.getLine()==line).findAny().orElseThrow(()->new IllegalArgumentException());
    }

    public void getResult(short formul,T num1, T num2){
        operation = selectOperation(formul).getOperation();
        BigDecimal calculate = operation.calculate(num1, num2);
        operation.display(Collections.singletonList(calculate));
    }
}
