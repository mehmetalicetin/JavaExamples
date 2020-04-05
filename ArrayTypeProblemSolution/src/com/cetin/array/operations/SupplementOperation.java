package com.cetin.array.operations;

public class SupplementOperation extends Operation {

    protected Object[] getNumbers(Object[]... numbers) {
        return numbers.length > 0 ? numbers : null;
    }

    protected void showResult() {
        super.showResult();
    }

    protected void calculateOperation() {
        super.calculateOperation();
    }

    protected void choiceOperation() {
        super.choiceOperation();
    }
}
