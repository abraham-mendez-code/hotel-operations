package com.pluralsight.hotel_operations;

// this class is responsible for knowing everything related to a hotel room
public class Room {
    private int numBeds;
    private double price;
    private boolean occupied;
    private boolean clean;
    private boolean available; // only true if room is clean and not occupied

    public Room(int numBeds, double price, boolean occupied, boolean clean, boolean available) {
        this.numBeds = numBeds;
        this.price = price;
        this.occupied = occupied;
        this.clean = clean;
        this.available = available;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
