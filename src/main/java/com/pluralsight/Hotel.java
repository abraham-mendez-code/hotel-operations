package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {

        boolean booked = false;

        if (isSuite) {
            if (getNumberOfSuites() < getBookedSuites()) {
                setBookedSuites(getBookedSuites() + 1);
                booked = true;
            }
        }
        else if (getNumberOfRooms() < getBookedBasicRooms()) {
            setBookedBasicRooms(getNumberOfRooms() + 1);
            booked = true;
        }

        return booked;

    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return getNumberOfSuites() - getBookedSuites();
    }

    public int getAvailableRooms() {
        return getNumberOfRooms() - getBookedBasicRooms();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
