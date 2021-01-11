package com.cetin.bicycles;

public class BicycleWithEnginee {
    Bicycle  bicycle;
    int counter;

    private static final BicycleWithEnginee bicycleWithEnginee = new BicycleWithEnginee();

    private BicycleWithEnginee() {
    }

    public static BicycleWithEnginee getInstance(){
        return bicycleWithEnginee;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

   public void increament(){
        counter++;
   }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
