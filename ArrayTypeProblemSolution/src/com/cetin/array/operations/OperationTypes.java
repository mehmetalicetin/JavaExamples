package com.cetin.array.operations;

import java.util.Arrays;

public enum OperationTypes {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    String operator;

    OperationTypes(String operator) {
        this.operator = operator;
    }

    public static OperationTypes getOperation(String value) {
        return Arrays.stream(OperationTypes.values()
                            ).filter(t -> t.operator.equalsIgnoreCase(value)
                            ).findFirst().orElseThrow(IllegalArgumentException::new);
    }

}
