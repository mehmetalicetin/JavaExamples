package com.cetin.array.operations;

import com.cetin.com.cetin.operation.util.Utility;

public class Fetcher implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + " ------->");
        doProcess();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void doProcess() {
        try {
            String oper = "+";
            process(oper);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private static void process(String oper) throws Exception {
        Double[] arr = new Double[5];
        Utility.add(arr, 5);
        Utility.add(arr, 8);
        Utility.choiceOperation(OperationTypes.getOperation(oper), Utility.arrayStaic);
    }
}
