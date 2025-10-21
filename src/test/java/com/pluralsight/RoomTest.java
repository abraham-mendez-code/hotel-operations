package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RoomTest {

    @Test
    public void should_be_occupied_and_dirty_after_check_in() {

        // arrange
        Room room = new Room(1, 500, false, false);
        boolean expectedIsOccupied = true;
        boolean expectedIsDirty = true;

        // act
        room.checkIn();

        // assert
        boolean actualIsOccupied = room.isOccupied();
        boolean actualIsDirty = room.isDirty();
        assertEquals(expectedIsOccupied, actualIsOccupied);
        assertEquals(expectedIsDirty, actualIsDirty);

    }

    @Test
    public void check_in_should_fail_if_occupied() {

        // arrange
        Room room = new Room(1, 1, true, false);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isDirty());
    }

    @Test
    public void check_in_should_fail_if_dirty() {

        // arrange
        Room room = new Room(1,1, false, true);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());

    }

    @Test
    public void checkOut_should_fail_if_not_occupied() {

        // arrange
        Room room = new Room(1, 1, false, true);

        // act
        room.checkOut();

        // assert
        assertTrue(room.isDirty());

    }

    public void check_out_should_clean_and_empty_room() {

        // arrange
        Room room = new Room(1, 1, true, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());

    }

}