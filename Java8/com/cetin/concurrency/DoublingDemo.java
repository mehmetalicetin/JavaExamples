package com.cetin.concurrency;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Fork(value = 2, jvmArgs = {"-Xms4G", "-Xmx4G"})
public class DoublingDemo {

    public static void main(String[] args) throws IOException, RunnerException {
        Options opt = new OptionsBuilder()
                .include(DoublingDemo.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    public int doubleIt(int n){
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return n*2;
    }

    @Benchmark
    public int doubleAndSumSequential(){
        return IntStream.of(3,1,2,4,5,9)
                .map(this::doubleIt)
                .sum();
    }


    @Benchmark
    public int doubleAndSumParallel(){
        return IntStream.of(3,1,2,4,5,9)
                .map(this::doubleIt)
                .parallel()
                .sum();
    }
}
