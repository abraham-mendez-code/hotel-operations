package com.pluralsight;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel", 5, 5, 0, 0);

        System.out.println(hotel.getAvailableRooms()); //show the avail rooms
        System.out.println(hotel.getAvailableSuites()); //show the avail suites

        System.out.println(hotel.bookRoom(1, true)); //book a suite

        System.out.println(hotel.bookRoom(1, false)); //book a basic room

        System.out.println(hotel.getAvailableRooms()); //show the avail rooms
        System.out.println(hotel.getAvailableSuites()); //show the avail suites

        System.out.println(hotel.bookRoom(100, true)); //book too many suites
        System.out.println(hotel.bookRoom(100, false)); //book too many basic rooms

        System.out.println(hotel.getAvailableRooms()); //show the avail rooms
        System.out.println(hotel.getAvailableSuites()); //show the avail suites


    }

}
