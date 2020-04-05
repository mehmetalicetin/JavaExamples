package com.cetin.operation.launch;

import com.cetin.array.operations.Fetcher;
import com.cetin.array.operations.OperationTypes;
import com.cetin.com.cetin.operation.util.Utility;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Launch {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Fetcher fetcher = new Fetcher();
            executorService.execute(fetcher);
            Thread.sleep(1000L );
        }
        executorService.shutdown();
        final boolean b = executorService.awaitTermination(1000, TimeUnit.NANOSECONDS);
        System.out.println(b);
    }
}
