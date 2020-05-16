package com.cetin.numchecker;

import java.util.Objects;
import java.util.function.IntPredicate;

public class NumChecker {
    private int num;

    public NumChecker(int num) {
        this.num = num;
    }

    boolean isBigger(int n){
        return num > n;
    }

    public String getName(){
        return "Ali";
    }
    public static void main(String[] args) {
        NumChecker numChecker = new NumChecker(5);
        int numToCompare = 9;
        IntPredicate intPredicate = p -> numChecker.isBigger(p);
       // IntPredicate intPredicate = numChecker::isBigger;
        boolean result = intPredicate.test(numToCompare);
        Nameable name = numChecker::getName;
        String objects = new String();
        Nameable name2 = objects::toString;
        System.out.println(name.getName());
    }
}
