package com.cetin.array.operations;

import java.util.Optional;

public class Operation implements IOperation {
    private Object[] numbers;
    private Double result;

    @Override
    public void doOperation() throws Exception {
        calculateOperation();
        showResult();
    }

    @Override
    public void preOperation(Object ... numbers) throws Exception {
        setNumbers(numbers);
        getNumbers();
    }


    protected void setNumbers(Object... numbers) throws Exception{
        if(numbers == null) throw new NullPointerException("Input Numbers cannot be null.");
        this.numbers = numbers;
    }

    protected Object[] getNumbers() {
        return this.numbers == null ? new Double[]{0.0,0.0} : numbers;
    }

    protected void showResult() throws Exception {
    }

    protected void calculateOperation() {
    }

}
