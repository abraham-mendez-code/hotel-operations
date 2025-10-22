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

        // if booking a suite
        if (isSuite) {
            // if there are enough suites avail book them
            if (roomsToBook <= getAvailableSuites()) {
                this.bookedSuites += roomsToBook;
                return true;
            }
        } // if booking a basic room, check if there are enough basic rooms avail and book
        else if (roomsToBook <= getAvailableRooms()) {
            this.bookedBasicRooms += roomsToBook;
            return true;
        }

        // unable to book
        return false;

    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

}
