package com.cetin.lamda;

import java.util.concurrent.Callable;

public class ServiceCallable implements Callable {
    @Override
    public Object call() throws Exception {
       return operatorPlus();
    }

    public static int operatorPlus(){
        return 5;
    }
}
