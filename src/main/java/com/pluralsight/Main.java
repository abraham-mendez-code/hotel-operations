package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        //testing our room
        Room someRoom = new Room(2, 420.0, false, false);

        //is it available?
        System.out.println("is the room available:" + someRoom.isAvailable());

        //if statement similar to above
        if(someRoom.isAvailable()){
            System.out.println("The room is available");
        }else{
            System.out.println("The room is not available");
        }

        //change property to make the room not available
        someRoom.setDirty(true);

        System.out.println("The room is now dirty!");

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
    }

}
