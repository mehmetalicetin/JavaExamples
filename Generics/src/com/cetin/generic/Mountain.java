package com.cetin.generic;

public class Mountain {
    String name;
    Integer altitude;

    public Mountain(String name, int altitude) {
        this.name = name;
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}
