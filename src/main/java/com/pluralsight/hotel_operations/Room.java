package com.pluralsight.hotel_operations;

// this class is responsible for knowing everything related to a hotel room
public class Room {
    private int numBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available = false; // only true if room is clean and not occupied

    public Room(int numBeds, double price, boolean occupied, boolean dirty) {
        this.numBeds = numBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        if (!this.dirty && !this.occupied) {
            this.available = true;
        }
    }

    public int getNumBeds() {
        return numBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }

}
