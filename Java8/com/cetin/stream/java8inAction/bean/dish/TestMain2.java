package com.cetin.stream.java8inAction.bean.dish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/*
Advantages of partitioning:
Partitioning has the advantage of keeping both lists of the stream elements.
* */
public class TestMain2 {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        partitionedMenu(menu);

        vegatarianDishesbyType(menu);

        mostCaloricVegetarian(menu);

        //vegetarian olup calories 500'den büyük olanlar ve kucuk olanlar.
        vegetarianByFatDishes(menu);

        countingOfVegetarian(menu);

        primeNumber();

    }

    private static void primeNumber() {
        Map<Boolean, List<Integer>> primeNumbers = partitionPrimes(5);
        System.out.println(primeNumbers);

        System.out.println("prime numbers count:"+primeNumbers.get(true).stream().count());
        System.out.println("non prime numbers count:"+primeNumbers.get(false).stream().count());
    }

    private static void countingOfVegetarian(List<Dish> menu) {
        Map<Boolean,Long> countingOfVegetarian = menu.stream().collect(partitioningBy(Dish::isVegetarian,counting()));
        System.out.println(countingOfVegetarian);
    }

    private static void vegetarianByFatDishes(List<Dish> menu) {
        Map<Boolean, Map<Boolean,List<Dish>>> vegetarianByFatDishes = menu.stream().collect(partitioningBy(Dish::isVegetarian,
                partitioningBy(d -> d.getCalories() > 500)));
        System.out.println(vegetarianByFatDishes);
    }

    private static void mostCaloricVegetarian(List<Dish> menu) {
        Map<Boolean,Dish> mostCaloricPartitionedByVegatarian =
                menu.stream().collect(partitioningBy(Dish::isVegetarian,
                   Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricPartitionedByVegatarian);
    }

    private static void vegatarianDishesbyType(List<Dish> menu) {
        Map<Boolean, Map<Dish.Type,List<Dish>>> vegatarianDishesByType = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
        System.out.println(vegatarianDishesByType);
    }

    private static void partitionedMenu(List<Dish> menu) {
        Map<Boolean,List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println(partitionedMenu);

        List<Dish> vegetarianList = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        //or
        List<Dish> vegatarianList2 = partitionedMenu.get(true);
    }

    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean,List<Integer>> partitionPrimes(int n){
        return IntStream.rangeClosed(2,n).boxed().collect(partitioningBy(TestMain2::isPrime));
    }
}
