package com.cetin.predicate;

import java.util.function.BiPredicate;

public class Java8BiPredicate {
    public static void main(String[] args) {
        BiPredicate<String, Integer> check = (x, y) -> {
            return x.length() == y;
        };

        boolean result = check.test("cetin", 5);

        System.out.println("is it correct :"+result);
    }
}
