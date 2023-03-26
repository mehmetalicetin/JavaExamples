package com.cetin.optional;

import java.util.Optional;
import java.util.Random;

public class MyOptional {
    public static void main(String[] args) {
        Optional<Object> opt1 = Optional.of("Hello");
        Optional<Object> opt2 = Optional.ofNullable(null);
        Optional<Object> opt3 = Optional.empty();

        ifPresentOrElse(opt1);
        ifPresentOrElse(opt2);
        //ifPresentOrElse(opt3);

       /* Optional<String> host = Optional.ofNullable(null);
        System.out.println(getHost(host));

        Optional<Integer> port = Optional.ofNullable(null);
        System.out.println(getPort(port));

        Optional<Object> throwEx = Optional.ofNullable(null);
        elseThrowException(throwEx);*/
    }

    /*But the code in Listing is still long and tedious.*/
    public static void isPresent(Optional<Object> holder){
        if(!holder.isPresent()){
            throw new IllegalArgumentException("val cannot be null");
        }
        Object val = holder.get();
    }

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void printNullException(){
        System.out.println("The value cannot be null!!");
    }

    public static void ifPresentOrElse(Optional<Object> optHolder){
       // Consumer<Optional> consumer =  MyOptional::print;
        //optHolder.ifPresent(consumer);
        optHolder.ifPresent(MyOptional::print);
       // optHolder.ifPresentOrElse(MyOptional::print, MyOptional::printNullException);
    }

    public static String getHost(Optional<String> opt){
       return opt.orElse("localhost");
    }

    public static int getNextAvailablePort() {
        int min = 49152;
        int max = 65535;
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static int getPort(Optional<Integer> opt){
        return opt.orElseGet(MyOptional::getNextAvailablePort);
    }

    public static void elseThrowException(Optional<Object> opt){
        opt.orElseThrow(IllegalArgumentException::new);
    }

}
