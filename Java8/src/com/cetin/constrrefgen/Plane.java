package com.cetin.constrrefgen;

public class Plane<X,Y,Z> extends Vehicle{
    private X make;
    private Y model;
    private Z year;

    public Plane(X make, Y model, Z year) {
        super(make,model,year);
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
