package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void punch_in_equals_passed_value() {

        // arrange
        Employee employee = new Employee(1234, "Bill", "IT", 21.45, 40);
        double expectedTime = 13.12;
        double actualTime;

        // act
        employee.punchIn(expectedTime);
        actualTime = employee.getPunchIn();

        // assert
        assertEquals(expectedTime, actualTime);

    }

    @Test
    void punch_in_overloaded_returns_current_time() {

        // arrange
        Employee employee = new Employee(1234, "Bill", "IT", 21.45, 40);
        LocalTime now = LocalTime.now();
        double expectedTime = now.getHour() + (double) now.getMinute() / 60;

        // act
        employee.punchIn();
        double actualTime = employee.getPunchIn();

        // assert
        assertEquals(expectedTime, actualTime);

    }

    @Test
    void punch_out_equals_passed_value() {

        // arrange
        Employee employee = new Employee(1234, "Bill", "IT", 21.45, 40);
        double expectedTime = 13.12;
        double actualTime;

        // act
        employee.punchOut(expectedTime);
        actualTime = employee.getPunchOut();

        // assert
        assertEquals(expectedTime, actualTime);

    }

    @Test
    void punch_out_overloaded_returns_current_time() {

        // arrange
        Employee employee = new Employee(1234, "Bill", "IT", 21.45, 40);
        LocalTime now = LocalTime.now();
        double expectedTime = now.getHour() + (double) now.getMinute() / 60;

        // act
        employee.punchOut();
        double actualTime = employee.getPunchOut();

        // assert
        assertEquals(expectedTime, actualTime);

    }

}
