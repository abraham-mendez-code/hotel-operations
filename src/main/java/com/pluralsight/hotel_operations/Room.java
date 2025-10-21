package com.pluralsight.hotel_operations;

// this class is responsible for knowing everything related to a hotel room
public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean available = false; // only true if room is clean and not occupied

    public Room(int numBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numBeds;
        this.price = price;
        this.isOccupied = occupied;
        this.isDirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        if (!this.isDirty() && !this.isOccupied()) {
            return true;
        }
        return false;
    }

}
