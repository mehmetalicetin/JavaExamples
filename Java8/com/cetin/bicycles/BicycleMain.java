package com.cetin.bicycles;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BicycleMain {
    public static void main(String[] args) {

        BicycleWithEnginee bicycleWithEnginee = BicycleWithEnginee.getInstance();

        BicycleWithEnginee bicycleWithEnginee1 = BicycleWithEnginee.getInstance();

        bicycleWithEnginee.setCounter(1);

        bicycleWithEnginee.increament();
        bicycleWithEnginee1.increament();
        bicycleWithEnginee1.increament();

        System.out.println("deger:" + bicycleWithEnginee.getCounter());
    }
        /*

        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        Bicycle[] bicycles = bikeBrands.stream().map(Bicycle::new).toArray(Bicycle[]::new);
        Optional<Bicycle> bicycle = bikeBrands.stream().map(Bicycle::new).findFirst();
        System.out.println(bicycle.get().toString());
        Optional<String> str = bikeBrands.stream().map(String::new).findFirst();
        System.out.println(str.get());
//    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//    R apply(T t);
        Bicycle[] bicycles2 = new Bicycle[]{
            new Bicycle("as"),
                new Bicycle("sa")
        };

        //bicycles = bicycles2;

        for (int i =0; i<bicycles.length ; i++){
            System.out.println(bicycles[i].getBrand());
        }
    }*/
}

class Bicycle {

    private String brand;
    private Integer frameSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }

    public Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", frameSize=" + frameSize +
                '}';
    }
}
