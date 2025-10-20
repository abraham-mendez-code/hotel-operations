package com.pluralsight.hotel_operations;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
        return reservationTotal;
    }
}
