package com.cetin.array.operations;

public class Utility {
    public static void add(Double [] array, double number){
        if(array != null && array.length > 0){
            int size = array.length;
            try {
                for(int i=0 ; i<size; i++){
                    if(array[i] == null){
                        array[i] = number;
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Array is filled Don't push it !!"+array.length);
            }
        }
    }

    public static void main(String[] args) {
        Double [] da = new Double[3];
        da[0] = 1.0;
        add(da,2);
        System.out.println(da[1]);
    }
}
