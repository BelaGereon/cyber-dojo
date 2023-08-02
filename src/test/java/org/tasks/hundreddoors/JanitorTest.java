package org.tasks.hundreddoors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.tasks.hundreddoors.DoorStatus.CLOSED;
import static org.tasks.hundreddoors.DoorStatus.OPEN;

public class JanitorTest {

    private static Janitor janitor;
    static Corridor corridor;

    @BeforeEach
    void setUp(){
        janitor = new Janitor();
        corridor = new Corridor();
    }

    @Test
    void shouldOpenAllDoors_WhenCorridorHasOneDoor() {
        //given
        List<Door> doors = corridor.createDoors(1);
        boolean doorIsClosed = CLOSED.equals(doors.get(0).getStatus());
        assertTrue(doorIsClosed);

        //when
        List<Door> visitedDoors = janitor.visitDoors(doors);
        boolean doorIsOpen = OPEN.equals(visitedDoors.get(0).getStatus());

        //then
        assertTrue(doorIsOpen);
    }

    @Test
    void shouldOpenFirstDoor_andCloseSecond_whenCorridorHasTwoDoors() {
        // given
        List<Door> doors = corridor.createDoors(2);

        // when
        List<Door> visitedDoors = janitor.visitDoors(doors);
        boolean firstDoorsIsOpen = OPEN.equals(visitedDoors.get(0).getStatus());
        boolean secondDoorIsClosed = CLOSED.equals(visitedDoors.get(1).getStatus());

        // then
        assertTrue(firstDoorsIsOpen);
        assertTrue(secondDoorIsClosed);
    }

    @Test
    void shouldHaveOpenedCorrectDoors_whenCorridorHas100Doors() {
        // given
        List<Door> doors = corridor.createDoors(100);
        List<Integer> expectedOpenedDoorsRoomNumbers = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);

        // when
        List<Door> visitedDoors = janitor.visitDoors(doors);
        List<Door> openedDoors = corridor.getDoorsWithStatus(visitedDoors, OPEN);
        List<Door> closedDoors = corridor.getDoorsWithStatus(visitedDoors, CLOSED);

        List<Integer> openedDoorsRoomNumbers =
                corridor.getRoomNumbers(openedDoors);
        List<Integer> closedDoorsRoomNumbers =
                corridor.getRoomNumbers(closedDoors);

        boolean closedDoorRoomNumbersDoNotContainAnyOpenDoorRoomNumbers = !closedDoorsRoomNumbers.containsAll(expectedOpenedDoorsRoomNumbers);

        // then
        assert(openedDoorsRoomNumbers).containsAll(expectedOpenedDoorsRoomNumbers);
        assertTrue(closedDoorRoomNumbersDoNotContainAnyOpenDoorRoomNumbers);

    }
}
