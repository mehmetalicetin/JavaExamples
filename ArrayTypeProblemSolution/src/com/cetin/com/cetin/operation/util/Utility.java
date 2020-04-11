package com.cetin.com.cetin.operation.util;

import com.cetin.array.operations.*;

public class Utility {
    static double number = 5;
    public static Double[] arrayStaic;

    public static void add(Double[] array, double number) {
        int index = 0;
        if (array != null) {
            arrayStaic = add2(array, number, index);
        }
    }

    public static Double[] add2(Double[] array, double number, int index) {
        try {
            if (array[array.length - 1] != null) {
                array = doGrowArrayCapacity(array);
            }
            if (array[index] == null) {
                array[index] = number;
                return array;
            } else {
                add2(array, number, ++index);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is filled Don't push it !!" + array.length);
        }
        return array;
    }

    public static Double[] doGrowArrayCapacity(Double[] objArray) {
        if (objArray != null) {
            Double[] newArray = new Double[objArray.length * 2];
            copyOldToNew(objArray, newArray);
            objArray = newArray;
        }
        return objArray;
    }

    private static void copyOldToNew(Double[] objArray, Double[] newArray) {
        System.arraycopy(objArray, 0, newArray, 0, objArray.length);
    }

    public static void main(String[] args) {
        Double[] a = new Double[2];
        a[0] = 1.0;
        add(a, 2.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);
        add(a, 3.0);


    }


    public static void choiceOperation(OperationTypes operationTypes, Double... numbers) throws Exception {
        switch (operationTypes) {
            case ADDITION:
                process(new Addition(), numbers);
            case SUBTRACTION:
                process(new Subcraption(), numbers);
            case MULTIPLICATION:
                process(new Multiplication(), numbers);
            case DIVISION:
                process(new Division(), numbers);
        }
    }

    public static <T> void process(IOperation<? extends IOperation<T>> operation, Double... numbers) throws Exception {
        operation.preOperation(numbers);
        operation.doOperation();
    }

}
