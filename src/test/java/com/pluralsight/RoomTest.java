package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RoomTest {

    @Test
    void should_be_occupied_and_dirty_after_check_in() {

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
    void check_in_should_not_dirty_occupied_room() {

        // arrange
        Room room = new Room(1, 1, true, false);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isDirty());
    }

    @Test
    void check_in_should_not_occupy_if_dirty() {

        // arrange
        Room room = new Room(1,1, false, true);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());

    }

    @Test
    void checkOut_should_fail_if_not_occupied() {

        // arrange
        Room room = new Room(1, 1, false, true);

        // act
        room.checkOut();

        // assert
        assertTrue(room.isDirty());

    }

    @Test
    void check_out_should_clean_and_empty_room() {

        // arrange
        Room room = new Room(1, 1, true, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());

    }

    @Test
    void clean_room_should_make_the_room_not_dirty () {

        // arrange
        Room room = new Room(1, 1, false, true);

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isDirty());

    }

    @Test
    void clean_room_should_fail_if_occupied() {

        // arrange
        Room room = new Room(1, 1, true, true);

        // act
        room.cleanRoom();

        // assert
        assertTrue(room.isDirty());

    }

}