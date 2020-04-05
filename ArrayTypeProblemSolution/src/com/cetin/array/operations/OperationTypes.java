package com.cetin.array.operations;

public enum OperationTypes {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    String operator;

    OperationTypes(String operator){
        this.operator=operator;
    }

}
