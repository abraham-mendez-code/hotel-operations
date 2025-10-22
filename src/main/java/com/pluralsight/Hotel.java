package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;

        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomsToBook, boolean isSuite) {

        boolean booked = false;

        if (isSuite) {
            if ((this.bookedSuites + roomsToBook) <= this.numberOfSuites) {
                this.bookedSuites += roomsToBook;
                booked = true;
            }
        }
        else if ((this.bookedBasicRooms + roomsToBook ) <= this.numberOfRooms) {
            this.bookedBasicRooms += roomsToBook;
            booked = true;
        }

        return booked;

    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

}
