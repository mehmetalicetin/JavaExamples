package com.cetin.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class SampleParallelStreams {

    public static void main(String[] args) {
        runIt();
    }

    public static int doubleIt(int n){
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return n*2;
    }

    public static void runIt(){
        Instant before = Instant.now();

        IntStream intStream = IntStream.of(3, 1, 4, 1, 5, 9);

        //int sum = getSumSequential(intStream);
        int sum = getsumParallel(intStream);

        Instant after = Instant.now();

        Duration duration = Duration.between(before, after);

        System.out.println("Total of double it :"+ sum);
        System.out.println("Duration : "+duration.toMillis()+"ms.");
    }

    private static int getSumSequential(IntStream intStream) {
        return intStream.map(SampleParallelStreams::doubleIt).sum();
    }

    private static int getsumParallel(IntStream intStream) {
        return intStream.parallel().map(SampleParallelStreams::doubleIt).sum();
    }
}
