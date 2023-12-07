package com.cetin.stream.java8inAction.bean.dish;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class TestMain {
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

        groupingProcess(menu);

        multiLevelGroupingBy(menu);

        groupByCounting(menu);

        mostCaloricType(menu);

        totalCaloriesByDishesType(menu);

        caloricLevelByType(menu);

    }

    private static void caloricLevelByType(List<Dish> menu) {
        Map<Dish.Type, Set<Dish.CaloricLevel>> caloricLevelsByType = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
            if (dish.getCalories() < 400) return Dish.CaloricLevel.DIET;
            else if (dish.getCalories() < 700) return Dish.CaloricLevel.NORMAL;
            else return Dish.CaloricLevel.FAT;
        }, toSet())));

        Map<Dish.Type, Set<Dish.CaloricLevel>> caloricLevelsByType2 = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
            if (dish.getCalories() < 400) return Dish.CaloricLevel.DIET;
            else if (dish.getCalories() < 700) return Dish.CaloricLevel.NORMAL;
            else return Dish.CaloricLevel.FAT;
        }, toCollection(HashSet::new))));

        caloricLevelsByType.forEach((key,value)->{
            System.out.println("Dishes Type:"+ key+"    Caloric Level:"+value);
        });
    }

    private static void totalCaloriesByDishesType(List<Dish> menu) {
        Map<Dish.Type, Integer> totalCaloriesByType =
                menu.stream().collect(groupingBy(Dish::getType,
                        summingInt(Dish::getCalories)));
        totalCaloriesByType.forEach((key,value) -> System.out.println("Dish Type:"+key+"     Total Calorie:"+value));
    }

    private static void mostCaloricType(List<Dish> menu) {
        Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream()
                .collect(groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        mostCaloricByType.forEach((key,value)->{
            System.out.println("Dish Type:"+key+"   Max Caloric Dish:"+value.get());
        });
    }

    private static void groupByCounting(List<Dish> menu) {
        Map<Dish.Type,Long> typesCount = menu.stream().collect(groupingBy(Dish::getType, Collectors.counting()));
        typesCount.forEach((key,value) -> System.out.println("Dish Type:"+key+"     Count:"+value));
    }

    private static void multiLevelGroupingBy(List<Dish> menu) {
        Map<Dish.Type, Map<Dish.CaloricLevel,List<Dish>>> dishesByTypeOfCaloricLevel = menu.stream().collect(
                groupingBy(Dish::getType, groupingBy(
                        dishes -> {
                            if (dishes.getCalories() < 400)
                                return Dish.CaloricLevel.DIET;
                            else if (dishes.getCalories() < 700) {
                                return Dish.CaloricLevel.NORMAL;
                            } else {
                                return Dish.CaloricLevel.FAT;
                            }
                        }
                ))
        );

        for (Map.Entry<Dish.Type, Map<Dish.CaloricLevel, List<Dish>>> entry : dishesByTypeOfCaloricLevel.entrySet()) {
            Dish.Type dishType = entry.getKey();
            Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel = entry.getValue();
            System.out.println("DishType:"+dishType);
            dishesByCaloricLevel.forEach((k,v) -> {
                System.out.println("Caloric Level:"+k+"   Dishes:"+v);
            });
        }
    }

    private static void groupingProcess(List<Dish> menu) {
        Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(groupingBy(dishes -> {
            if (dishes.getCalories() < 400)
                return Dish.CaloricLevel.DIET;
            else if (dishes.getCalories() < 700)
                return Dish.CaloricLevel.NORMAL;
             else
                return Dish.CaloricLevel.FAT;

        }));

        dishesByCaloricLevel.forEach((k,v) -> {
            System.out.println("Caloric Level:"+k+"   Dishes:"+v);
        });
    }
}
