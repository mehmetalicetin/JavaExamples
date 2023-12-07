package com.cetin.com.cetin.operation.util;

import com.cetin.array.operations.*;

public class Utility {
    public static Object[] arrayStaic;

    public static void add(Object[] array, double number) {
        int index = 0;
        if (array != null) {
            arrayStaic = add2(array, number, index);
        }
    }

    public static Object[] add2(Object[] array, double number, int index) {
        try {
            if (array[array.length - 1] != null) {
                array = increaseArrayCapacity(array);
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

    public static Object[] increaseArrayCapacity(Object[] objArray) {
        if (objArray != null) {
            Object[] newArray = new Object[objArray.length * 2];
            copyOldToNew(objArray, newArray);
            objArray = newArray;
        }
        return objArray;
    }

    private static void copyOldToNew(Object[] objArray, Object[] newArray) {
        for (int i =0; i<objArray.length; i++){
            newArray[i] = objArray[i];
        }
    }

    public static void main(String[] args) {
        /*Object[] a = new Object[2];
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
        add(a, 3.0);*/

        CMACollection collection = new CMACollection();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        System.out.println(collection);

        System.out.println("Collection size: "+collection.size());

        System.out.println("Retriving object index :1 :"+collection.get(1));

        collection.remove(1);
        System.out.println("Removing object index :1 :"+collection);

        collection.replace(0, "X");
        System.out.println("Replacing object index:0 :"+collection);

        collection.insert(1,"Y");
        System.out.println("Inserting object index:1 :"+collection);

    }


    public static void choiceOperation(OperationTypes operationTypes, Object... numbers) throws Exception {
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

    public static <T> void process(IOperation<? extends IOperation<T>> operation, Object... numbers) throws Exception {
        operation.preOperation(numbers);
        operation.doOperation();
    }

}
