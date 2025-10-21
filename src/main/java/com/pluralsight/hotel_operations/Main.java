package com.pluralsight.hotel_operations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Reservation reservation = new Reservation("king", 3, false);
        Room room = new Room(1, reservation.getReservationTotal(), false, false);

        System.out.println(reservation.getPrice());
    }

}
