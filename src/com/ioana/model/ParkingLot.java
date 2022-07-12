package com.ioana.model;

import java.util.List;

public class ParkingLot {
    private String name;
    private List<ParkingSpot> parkingSpots;
    private List<Valet> valets;


    public ParkingLot(String name, List<Valet> valets, List<ParkingSpot> parkingSpots) {
        this.name = name;
        this.valets = valets;
        this.parkingSpots = parkingSpots;
    }


    public void findEmptyParkingSpotForVehicleType(VehicleType vehicleType) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public List<Valet> getValets() {
        return valets;
    }

    public void setValets(List<Valet> valets) {
        this.valets = valets;
    }


}
