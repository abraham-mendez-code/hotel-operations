package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {

    private String name;
    private int numberOfRooms;
    private int bookedRooms;
    private ArrayList<Room> rooms;

    public Hotel(String name, ArrayList<Room> rooms) {

        this.name = name;
        this.rooms = rooms;
        this.numberOfRooms = rooms.size();
        //this.bookedRooms =

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
        return bookedRooms;
    }

    public void setBookedRooms(int bookedRooms) {
        this.bookedRooms = bookedRooms;
    }

    public int getNumOfAvailableRooms() {
        return this.getNumberOfRooms() - this.getBookedRooms();
    }

}
