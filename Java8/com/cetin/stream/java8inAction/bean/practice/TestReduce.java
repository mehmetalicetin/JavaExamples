package com.cetin.stream.java8inAction.bean.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
        example1();

        example2();

        example3();

        example4();

        example5();

        example6();

        //how we can use the Stream API to create infinite streams.
        example7();

        example8();
    }

    private static void example8() {
        //Collect vs. reduce
        /*We’ve discussed reductions a lot in the previous chapter and this one. You may naturally wonder
          what the differences between the collect and reduce methods of the Stream interface are,
          because often you can obtain the same results using either method. For instance, you can
          achieve what is done by the toList Collector using the reduce method as follows:*/
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
        List<Integer> numbers = stream.reduce(new ArrayList<Integer>(),
                                                (List<Integer> l1, Integer e) ->{
                                                l1.add(e);
                                                return l1; },
                                                (List<Integer> l1, List<Integer> l2)->{
                                                l2.addAll(l1);
                                                return l2; }
                                                );
        numbers.forEach(System.out::println);
    }

    private static void example7() {
        Stream<Integer> infinitiveStream = Stream.iterate(0, x->x+2);
        List<Integer> list = infinitiveStream.limit(55).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static void example6() {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }

    private static void example5() {
        OptionalInt maxValue = IntStream.range(0,100).reduce((x, y) -> x>y ? x:y);
        maxValue.ifPresent(System.out::println);
    }

    private static void example4() {
        int minValue = IntStream.range(0,100).reduce(0,(x, y)-> x<y ? x:y);
        System.out.println("Min Value:"+minValue);
    }

    private static void example3() {
        int sum = IntStream.range(1,5).reduce(0,Integer::sum);
        System.out.println("Method Reference:"+sum);
    }

    private static void example2() {
        int sum = IntStream.range(1,5).skip(3).reduce(0,(a, b)->a+b); //1 inclusive, 5 is not.
        System.out.println("Skip and Sum:"+sum);
    }

    private static void example1() {
        int sum = IntStream.range(1,3).reduce(0,(a, b)->a+b);
        System.out.println("Sum:"+sum);
    }
}
