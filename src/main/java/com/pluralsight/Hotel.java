package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Hotel {

    private String name;
    private int numberOfRooms;
    private int bookedRooms;
    private ArrayList<Room> rooms;

    public Hotel(String name, ArrayList<Room> rooms) {

        this.name = name;
        this.rooms = rooms;
        this.numberOfRooms = rooms.size();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedRooms() {
       return rooms.stream()
                .filter(r -> r.isOccupied())
                .collect(Collectors.toList()).size();
    }

    public int getNumOfAvailableRooms() {
        return rooms.stream()
                .filter(r -> r.isAvailable())
                .collect((Collectors.toList())).size();
    }

}
