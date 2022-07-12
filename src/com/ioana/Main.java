package com.ioana;

import com.ioana.model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    //creare Parking Spot
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

    //creare lista de vehicule
        List<Vehicle> vehicles = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Vehicles.txt"));
            String st;
            while ((st = reader.readLine()) != null) {
                String[] values = st.split(",");
                Vehicle vehicle = new Vehicle(VehicleType.valueOf(values[0]),values[1]);
                vehicles.add(vehicle);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("There was a problem reading from this file");
            ioException.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
