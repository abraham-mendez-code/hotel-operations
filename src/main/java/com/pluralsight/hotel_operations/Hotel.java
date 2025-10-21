package com.pluralsight.hotel_operations;

public class Hotel {

    private String name;
    private int numberOfRooms;
    private int bookedRooms;

    public Hotel(int numberOfRooms, String name) {
        this.numberOfRooms = numberOfRooms;
        this.name = name;
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

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
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
