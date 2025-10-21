package com.pluralsight;

// this class is responsible for knowing everything related to a hotel room
public class Room {
    private int numberOfBeds;
    private String roomType;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int numBeds, String roomType, boolean occupied, boolean dirty) {
        this.numberOfBeds = numBeds;
        this.roomType = roomType;
        this.isOccupied = occupied;
        this.isDirty = dirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
        return !this.isDirty() && !this.isOccupied();
    }

    public double getPrice() {

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
        return price;
    }
}
