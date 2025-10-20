package com.pluralsight.hotel_operations;

public class Main {

    public static void main(String[] args) {

        Reservation reservation = new Reservation("king", 3, false);
        Room room = new Room(1, reservation.getReservationTotal(), false, false);
    }

}
