package com.ioana.model;

public enum VehicleType {
    CAR, BUS, MOTORCYCLE;

    public static VehicleType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
