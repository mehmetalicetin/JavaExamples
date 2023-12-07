package com.cetin.stream.java8inAction.bean.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMatrix {
    public static void main(String[] args) {
        List<Integer> numList1 = Arrays.asList(1,2,3);
        List<Integer> numList2 = Arrays.asList(3,4);

        List<int[]> matrix = new ArrayList<>();
        for(int i  : numList1){
            for (int j : numList2){
                matrix.add(new int[]{i,j});
            }
        }

        print(matrix);


        List<int[]> pairs = numList1.stream().flatMap(i -> numList2.stream().map(j -> new int[]{i,j}))
                .collect(Collectors.toList());

        print(pairs);
    }

    private static void print(List<int[]> matrix) {
        matrix.stream().forEach(x-> {
            for (int i=0 ;i<x.length; i++) {
                if (i != x.length-1)
                    System.out.print(x[i] + ",");
                else
                    System.out.print(x[i]);
            }
            System.out.println();
        });
    }
}
