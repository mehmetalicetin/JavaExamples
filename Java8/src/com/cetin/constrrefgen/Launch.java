package com.cetin.constrrefgen;

public class Launch {
    public static void main(String[] args) {
        GenerateableVehicle<Car,String, String, Integer> car = Car<String, String, Integer>::new;
        Car honda = Vehicle.factory(car,"Honda","Civic",2010);
        honda.setLicence("True");
        honda.What();

        GenerateableVehicle<Plane, String,String,Integer> plane = Plane::new;
        Plane boing = Vehicle.factory(plane,"Boing","E360",2000);
        boing.What();
    }
}
