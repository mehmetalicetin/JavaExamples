package com.cetin.array.operations;

public class SubDivisionOperation extends Operation{

    protected Double[] getNumbers(Double number1, Double number2){
        return new Double[]{number1 == null ? 0:number1,number2 == null ? 0 :number2};
    }

    @Override
    protected void showResult() {
        super.showResult();
    }

    @Override
    protected void calculateOperation() {
        super.calculateOperation();
    }

    @Override
    protected void choiceOperation() {
        super.choiceOperation();
    }
}
