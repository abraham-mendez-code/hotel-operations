package com.pluralsight;

// this class is responsible for knowing everything related to a hotel room
public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int numBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numBeds;
        this.price = price;
        this.isOccupied = occupied;
        this.isDirty = dirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !this.isDirty() && !this.isOccupied();
    }

    public void checkIn() {
        setOccupied(true);
        setDirty(true);
    }

    public void checkOut() {
        setOccupied(false);
    }

    public void cleanRoom() {
        setDirty(false);
    }

}
