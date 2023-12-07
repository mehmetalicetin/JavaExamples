package com.cetin.constrrefgen;

public class Vehicle<Obj, X,Y,Z> {
    private X make;
    private Y model;
    private Z year;

    static <Obj,X,Y,Z> Obj factory(GenerateableVehicle<Obj, X,Y,Z> objx, X x, Y y, Z z){
        return objx.func(x,y,z);
    }

    public void What(){
        System.out.println(this.toString());
    }

    public Vehicle(X make, Y model, Z year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make=" + make +
                ", model=" + model +
                ", year=" + year +
                '}';
    }
}
