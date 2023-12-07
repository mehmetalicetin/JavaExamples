package com.cetin.consumer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = Demo::print;
        integerConsumer.accept(55);
        Consumer<Number> numberConsumer = Demo::print;
        numberConsumer.accept(55.55);
        Consumer<Object> objectConsumer = Demo::print;
        objectConsumer.accept("ali");

        BiConsumer<Integer, String> integerStringBiConsumer = Demo::biConsume;
        integerStringBiConsumer.accept(10,"Ali");

        BiFunction<Integer, String, String> integerStringDoubleBiFunction = Demo::biFunction;

        Function<Integer,String> function = Demo::function;

        Map<Integer, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.compute(100, Demo::biFunction);
        linkedHashMap.computeIfAbsent(101, Demo::function);
        linkedHashMap.computeIfPresent(101,Demo::biFunction);
        linkedHashMap.putIfAbsent(102,"putIfAbsent=>102");
        linkedHashMap.forEach(Demo::biConsume);

        linkedHashMap.forEach((key,value)->{
            System.out.println("Key"+key);
            System.out.println("Value"+value);
        });

        linkedHashMap.values().forEach(Demo::print);
    }

    public static void print(Object str){
        System.out.println("str:"+str);
    }

    public static  void biConsume(Integer integer, String str){
        System.out.println("biConsume=>Key:"+integer);
        System.out.println("biConsume=>Value:"+str);
    }

    public static String biFunction(Integer integer, String str){
        System.out.println("biFunction=>Str:"+str);
        System.out.println("biFunction=>Integer:"+integer);
        return "biFunction=>Mehmet";
    }

    public static String function(Integer integer){
        return "function=>Mehmet Ali";
    }
}
