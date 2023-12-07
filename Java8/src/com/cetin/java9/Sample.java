package com.cetin.java9;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//interface private methods
interface Util{
    default BigDecimal helper4() {
        return BigDecimal.valueOf(helper2()).add(BigDecimal.valueOf(hepler3()));
    }
    default BigDecimal helper5() {
        return BigDecimal.valueOf(helper2()).add(BigDecimal.valueOf(hepler3()));
    }
    static int getNumberOfCore(){return hepler3();}

    private static int hepler3() {
        return 4;
    }

    private int helper(){return helper2();}

    private int helper2(){ return 16;}
}

//Effectively final in try-with-resources
class Resources implements AutoCloseable{
    Resources(){
        System.out.println("created...");
    }

    public void op1(){
        System.out.println("op1...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("clean up...");
    }
}


public class Sample {
    public static void main(String[] args) throws Exception {
/*        resources();
        takeAndDrop();
        iterateBoundAndUnBounds();
        optionalStream();*/


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Sample::factory);
        future.orTimeout(2, TimeUnit.SECONDS);
        future.thenAccept(System.out::println);
    }

    private static Integer factory() {
        return 42;
    }

    private static void optionalStream() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> first = numbers.stream()
                .filter(e -> e < 50)
                .findFirst();

        /*Integer first1 = numbers.stream()
                .filter(e-> e > 50)
                .findFirst()
                .get();*/

        Integer first2 = numbers.stream()
                .filter(e-> e>50)
                .findFirst()
                .orElse(0);

        Optional<Integer> first3 = numbers.stream()
                .filter(e-> e>50)
                .findFirst()
                .or(()->Optional.of(0));

        process(numbers.stream());

        process(
                numbers.stream()
                        .filter(e-> e > 50)
                        .findFirst()
                        .stream()
        );
    }

    public static void process(Stream<Integer> stream){
        stream.forEach(System.out::println);
    }

    ///Without bounds
    private static void iterateBoundAndUnBounds() {
        for(int i=0; i<= 5; i++){
            System.out.println(i);
        }

        IntStream.range(0,5).forEach(System.out::println);
        IntStream.rangeClosed(0, 5).forEach(System.out::println);

        for(int i = 0; i < 10; i = i + 2){
            System.out.println(i);
        }

        Stream.iterate(0, i-> i < 10, i->i+2)
                .forEach(System.out::println);

        Stream.iterate(0, i->i+2)
                .limit(3)
                .forEach(System.out::println);

        Stream.iterate(0, i->i+2)
                .takeWhile(i-> i< 100)
                .forEach(System.out::println);

    }

    //Stream takeWhile, dropWhile
    private static void takeAndDrop() {
        List<Integer> numbers = Arrays.asList(11,32,12,54,67,81,16,15);

        numbers.forEach(System.out::println);

        System.out.println("---------filter");
        //print only values greater than 55
        numbers.stream()
                .filter(e->e>55)
                .forEach(System.out::println);

        System.out.println("1---------skip");

        numbers.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("2---------dropWhile");

        numbers.stream()
                .dropWhile(e->e<55)
                .forEach(System.out::println);

        System.out.println("3---------limit");

        numbers.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("4---------takeWhile");

        numbers.stream()
                .takeWhile(e->e<55)
                .forEach(System.out::println);

    }

    private static void resources() throws Exception {
        try(Resources resources = new Resources()) {
            resources.op1();
        }
        System.out.println("done");
    }
}
