package com.ioana.model;

import java.util.List;

public class Valet {
    private List<VehicleType> vehicleTypes;
    private String name;

    public Valet(List<VehicleType> vehicleTypes, String name) {
        this.vehicleTypes = vehicleTypes;
        this.name = name;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
