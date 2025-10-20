package com.pluralsight.hotel_operations;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType.toLowerCase();
        switch (roomType) {
            case "king":
                this.price = 139.0;
                break;
            case "double":
                this.price = 124.0;
                break;
        }
        this.numberOfNights = numberOfNights;
        this.weekend = this.weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();
        switch (roomType) {
            case "king":
                this.price = 139.0;
                break;
            case "double":
                this.price = 124.0;
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.weekend = this.weekend;
    }

    public double getReservationTotal() {
        reservationTotal = price * numberOfNights;

        if (weekend) {
            reservationTotal += reservationTotal * .10;
        }

        return reservationTotal;
    }
}
