package com.cetin.concurrency;

import java.util.List;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {
        sequentialStreamOf();

        sequentialIterateStream();

        sequentialGenerateStream();
    }

    public static void sequentialStreamOf(){
        boolean isParallel = Stream.of(3, 1, 4, 5, 9).isParallel();
        System.out.println("is it paralel : "+ isParallel);
    }

    public static void sequentialIterateStream(){
        boolean isParallel = Stream.iterate(0, n->n+2).isParallel();
        System.out.println("is it paralel : "+ isParallel);
    }

    public static void sequentialGenerateStream(){
        boolean isParallel = Stream.generate(Math::random).isParallel();
        System.out.println("is it paralel : "+ isParallel);
    }

    public static void sequentialCollectionStream(){
        List<Integer> integers = List.of(3, 1, 4, 1, 5, 9);
        boolean isParallel = integers.stream().isParallel();
        System.out.println("is it paralel : "+ isParallel);
    }

}
