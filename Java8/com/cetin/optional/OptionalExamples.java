package com.cetin.optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        //1. only outputs a string when it is not empty
        Optional<String> str = Optional.of("Hello");
        str.filter(x->x.length()>0).ifPresent(System.out::println);

        Optional<String> strEmpy = Optional.ofNullable(null);
        strEmpy.filter(x->x.length()>0).ifPresent(System.out::println);

        //2. outputs the length of input string.
        Optional<String> str2 = Optional.of("Hello");
        str2.map(String::length).ifPresent(System.out::println);

        Optional<String> str3 = Optional.of("Hello");
        str3.map(String::toLowerCase).ifPresent(System.out::println);

        //3.flatMap() is very useful when handling long reference chain.
        Optional<Optional<String>> str4 = Optional.of(Optional.of("String"));
        str4.map(x->x.map(String::length)).ifPresent(System.out::println);

        str4.flatMap(x->addHello(x)).ifPresent(System.out::println);


        List<Optional<String>> optionalList = Arrays.asList(
                Optional.empty(),
                Optional.of("hello"),
                Optional.ofNullable(null),
                Optional.of("world")
        );
        String value = optionalList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElse(null);
        System.out.println(value);

     }

     public static Optional<String> addHello(Optional<String> str){
        return Optional.of(str.get().concat(" -> Hello"));
     }
}
