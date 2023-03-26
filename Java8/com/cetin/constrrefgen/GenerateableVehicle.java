package com.cetin.constrrefgen;

@FunctionalInterface
public interface GenerateableVehicle<Vehicle, X, Y, Z> {
    Vehicle func(X make, Y model, Z year);
}
