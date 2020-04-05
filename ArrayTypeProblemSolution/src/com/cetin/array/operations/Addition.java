package com.cetin.array.operations;

public class Addition extends Operation{
    private Double result = 0.0;
    Double[] numbers;

    @Override
    protected void setNumbers(Double... numbers) throws Exception {
        super.setNumbers(numbers);
        for (int i =0 ;i< numbers.length; i++){
            if(numbers[i] == null) numbers[i] = 0.0;
        }
        this.numbers = numbers;
    }

    @Override
    protected void showResult() throws Exception {
        System.out.println("Result :["+getResult()+"]");
    }

    @Override
    protected void calculateOperation() {
        for (Double number: getNumbers()) {
            result += number;
        }
    }

    @Override
    protected Double[] getNumbers() {
         return this.numbers;
    }

    public Double getResult() throws Exception {
      if(result == null)
          throw new Exception("Result cannot be null");
      else
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
