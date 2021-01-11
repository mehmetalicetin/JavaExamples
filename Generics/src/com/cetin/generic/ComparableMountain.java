package com.cetin.generic;

public class ComparableMountain implements Comparable<ComparableMountain>{
    String name;
    Integer altitude;

    public ComparableMountain(String name, Integer altitude) {
        this.name = name;
        this.altitude = altitude;
    }

    @Override
    public int compareTo(ComparableMountain comparableMountain) {
        return this.name.compareToIgnoreCase(comparableMountain.getName());
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
        return "ComparableMountain{" +
                "name='" + name + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}
