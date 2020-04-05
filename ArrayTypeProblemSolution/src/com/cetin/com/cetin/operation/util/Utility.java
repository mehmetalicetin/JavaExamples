package com.cetin.com.cetin.operation.util;

import com.cetin.array.operations.*;

public class Utility {
    static double number =5;
    public static Double [] arrayStaic;

    public static void add(Double[] array, double number) {
       int index = 0;
        if (array != null) {
          arrayStaic = add2(array,number,index);
        }
    }

    public static Double[] add2(Double[] array, double number, int index){
         try {
             if(array[index] == null){
                 array[index] = number;
                 return array;
             } else {
                 add2(array, number, ++index);
             }
         }catch (ArrayIndexOutOfBoundsException ex){
             System.out.println("Array is filled Don't push it !!" + array.length);
         }
        return array;
    }


    public static void choiceOperation(OperationTypes operationTypes, Double ... numbers) throws Exception {
        switch (operationTypes){
            case ADDITION:
                process(new Addition(),numbers);
            case SUBTRACTION:
                process(new Subcraption(),numbers);
            case MULTIPLICATION:
                process(new Multiplication(),numbers);
            case DIVISION:
                process(new Division(),numbers);
        }
    }

    public static <T> void process(IOperation<? extends IOperation<T>> operation, Double ... numbers) throws Exception {
        operation.preOperation(numbers);
        operation.doOperation();
    }

}
