package com.ioana;

import com.ioana.model.ParkingLot;
import com.ioana.model.ParkingSpot;
import com.ioana.model.Valet;
import com.ioana.model.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ParkingSpot parkingSpot = new ParkingSpot(VehicleType.getRandom(), i);
            parkingSpots.add(parkingSpot);
        }

        List<Valet> valets = new ArrayList<>();
        Valet valet1 = new Valet(Arrays.asList(VehicleType.CAR, VehicleType.BUS),"David");
        Valet valet2 = new Valet(Arrays.asList(VehicleType.CAR),"Ioana");
        Valet valet3 = new Valet(Arrays.asList(VehicleType.MOTORCYCLE, VehicleType.BUS),"SDKFSD");
        Collections.addAll(valets, valet1, valet2, valet3);

        ParkingLot parkingLot = new ParkingLot("First", valets, parkingSpots);

    }
}
