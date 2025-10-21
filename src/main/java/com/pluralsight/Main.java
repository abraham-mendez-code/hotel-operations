package com.pluralsight;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        //testing our room
        Room someRoom = new Room(2, 420.0, false, false);

        //if statement checking if the room is available
        if(someRoom.isAvailable()){
            System.out.println("The room is available");
        }else{
            System.out.println("The room is not available");
        }

        //test the checkIn method
        someRoom.checkIn();

        //tell user they are checking in
        System.out.println("Checking in!");

        //check if the room is available
        if(someRoom.isAvailable()){
            System.out.println("The room is available");
        }else{
            System.out.println("The room is not available");
        }

        //test the checkOut method
        someRoom.checkOut();

        System.out.println("Checking out!");

        if(someRoom.isAvailable()){
            System.out.println("The room is available");
        }else{
            System.out.println("The room is not available");
        }

        //test the cleanRoom method
        someRoom.cleanRoom();

        //tell the user the room is cleaned
        System.out.println("Cleaned the room!");

        //check if the room is available
        if(someRoom.isAvailable()){
            System.out.println("The room is available");
        }else{
            System.out.println("The room is not available");
        }


        //testing the reservation
        Reservation someReservation = new Reservation("double", 3, false);

        //check the price
        System.out.println("Room price: " + someReservation.getPrice());

        //check the reservation total
        System.out.println("Reservation total: " + someReservation.getReservationTotal());

        //change to a weekend
        someReservation.setIsWeekend(true);

        System.out.println("Its the weekend!");

        //check the price
        System.out.println("Room price: " + someReservation.getPrice());

        //check the reservation total
        System.out.println("Reservation total: " + someReservation.getReservationTotal());

        //change number of nights
        someReservation.setNumberOfNights(2);
        System.out.println("Booking for " + someReservation.getNumberOfNights() + " nights");

        //check the reservation total
        System.out.println("Reservation total: " + someReservation.getReservationTotal());


        //test the employee
        Employee someEmployee = new Employee("JSN1", "Jason", "Front Desk", 10.00, 40);

        // print out name
        System.out.println(someEmployee.getName());

        //print out regular hours
        System.out.println("Worked " + someEmployee.getRegularHours() + " regular hours");

        //print out OT hours
        System.out.println("Worked " + someEmployee.getOvertimeHours() + " overtime hours");

        //print total pay
        System.out.println("Total pay: " + someEmployee.getTotalPay());

        //add another hour so there is overtime
        someEmployee.setHoursWorked(41);

        // print out name
        System.out.println(someEmployee.getName());

        //print out regular hours
        System.out.println("Worked " + someEmployee.getRegularHours() + " regular hours");

        //print out OT hours
        System.out.println("Worked " + someEmployee.getOvertimeHours() + " overtime hours");

        //print total pay
        System.out.println("Total pay: " + someEmployee.getTotalPay());

        // test the punchIn and punchOut methods

        //get the current time
        LocalTime localTime = LocalTime.now();

        // get the current time as a double
        double time = (localTime.getHour() + (double) localTime.getMinute() / 60);

        // punch in
        someEmployee.punchIn(time);

        // get another value for the time, e.g 8 hours from now
        time = (localTime.getHour() + 8) + (double) localTime.getMinute() / 60;

        // punch out
        someEmployee.punchOut(time);

        // print out punch in and punch out values
        System.out.printf("Punched in: %.2f\n", someEmployee.getPunchIn());
        System.out.printf("Punched out: %.2f\n", someEmployee.getPunchOut());

        // use the overloaded methods to punch in and out
        someEmployee.punchIn();
        someEmployee.punchOut();

        // print out punch in and punch out values
        System.out.printf("Punched in: %.2f\n", someEmployee.getPunchIn());
        System.out.printf("Punched out: %.2f\n", someEmployee.getPunchOut());

    }

}
