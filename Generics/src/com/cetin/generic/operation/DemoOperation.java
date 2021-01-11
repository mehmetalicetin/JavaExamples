package com.cetin.generic.operation;

import java.math.BigDecimal;
import java.util.Collections;

public class DemoOperation {
    public static void main(String[] args) {
        Operation<Double> doubleOperation = Operation.getInstance();
        doubleOperation.getResult((short)1,45.0,45.0);

        IOperation<Integer> integerAddition = OperationType.ADD.getOperation();
        BigDecimal result2 = integerAddition.calculate(1,2);
        integerAddition.display(Collections.singletonList(result2.intValue()));
    }
}
