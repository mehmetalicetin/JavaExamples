package com.cetin.stream.java8inAction.bean.dish;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int colories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int colories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.colories = colories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getColories() {
        return colories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type{MEAT,FISH,OTHER}

    public enum CaloricLevel{ DIET, NORMAL, FAT }
}
