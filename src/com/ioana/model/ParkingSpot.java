package com.ioana.model;

public class ParkingSpot {
    private VehicleType vehicleType;
    private int number;
    private String vehicleLicensePlate;


    public ParkingSpot(VehicleType vehicleType, int number) {
        this.vehicleType = vehicleType;
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }
}
