package com.ioana.model;

public class Vehicle {
    private VehicleType vehicleType;
    private String vehicleLicensePlate;

    public Vehicle(VehicleType vehicleType, String vehicleLicensePlate) {
        this.vehicleType = vehicleType;
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }
}
