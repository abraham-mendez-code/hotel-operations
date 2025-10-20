package com.pluralsight.hotel_operations;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
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
        this.isWeekend = isWeekend;
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
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = this.isWeekend;
    }

    public double getReservationTotal() {
        reservationTotal = price * numberOfNights;

        if (isWeekend) {
            reservationTotal += reservationTotal * .10;
        }

        return reservationTotal;
    }
}
