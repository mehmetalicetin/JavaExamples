package com.cetin.constrrefgen;

public class Car<X,Y,Z> extends Vehicle{
    private X make;
    private Y model;
    private Z year;
    private String licence;

    public Car(X make, Y model, Z year) {
        super(make,model,year);
    }

    public Car(X make, Y model, Z year, String licence) {
        super(make,model,year);
        this.licence = licence;
    }

    @Override
    public void What() {
        System.out.println(this.toString());
    }

    public X getMake() {
        return make;
    }

    public void setMake(X make) {
        this.make = make;
    }

    public Y getModel() {
        return model;
    }

    public void setModel(Y model) {
        this.model = model;
    }

    public Z getYear() {
        return year;
    }

    public void setYear(Z year) {
        this.year = year;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make=" + make +
                ", model=" + model +
                ", year=" + year +
                ", licence='" + licence + '\'' +
                '}';
    }
}
