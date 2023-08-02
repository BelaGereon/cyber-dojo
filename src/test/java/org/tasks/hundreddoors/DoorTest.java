package org.tasks.hundreddoors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoorTest {

    private Door door;

    @BeforeEach
    void setUp() {
        door = new Door();
    }

    @Test
    void newDoor_isClosed() {
        assertEquals(DoorStatus.CLOSED, door.getStatus());
    }

    @Test
    void newDoor_shouldHaveNumber0() {
        int doorNumber = door.getRoomNumber();

        assertEquals(0, doorNumber);
    }

    @Test
    void toggleClosedDoor_shouldOpenDoor() {
        // when
        door.toggle();

        // then
        assertEquals(DoorStatus.OPEN, door.getStatus());
    }

    @Test
    void toggleDoorTwice_shouldResultInSameStatus() {
        door.toggle();
        door.toggle();

        assertEquals(DoorStatus.CLOSED, door.getStatus());
    }

}
