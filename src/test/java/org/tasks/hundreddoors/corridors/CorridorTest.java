package org.tasks.hundreddoors.corridors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.hundreddoors.Corridor;
import org.tasks.hundreddoors.Door;
import org.tasks.hundreddoors.DoorStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CorridorTest {

    final Corridor corridor = new Corridor();
    private List<Door> doors;

    @BeforeEach
    void setUp() {
        doors = corridor.createDoors(5);
    }

    @Test
    void createDoors_shouldAssignAscendingRoomNumbersToDoors() {
        assertEquals(1, doors.get(0).getRoomNumber());
        assertEquals(2, doors.get(1).getRoomNumber());
        assertEquals(3, doors.get(2).getRoomNumber());
        assertEquals(4, doors.get(3).getRoomNumber());
        assertEquals(5, doors.get(4).getRoomNumber());
    }

    @Test
    void checkDoors_shouldReturnList_WithDoorsToggleStatus() {
        // given
        openFirstThreeDoorsInCorridor();

        List<DoorStatus> expectedStatuses = new ArrayList<>();
        expectedStatuses.add(DoorStatus.OPEN);
        expectedStatuses.add(DoorStatus.OPEN);
        expectedStatuses.add(DoorStatus.OPEN);
        expectedStatuses.add(DoorStatus.CLOSED);
        expectedStatuses.add(DoorStatus.CLOSED);

        // when
        List<DoorStatus> toggleStatuses = corridor.checkDoors(doors);

        // then
        assertEquals(expectedStatuses, toggleStatuses);
    }

    @Test
    void getDoorsWithStatus_shouldReturnCorrectDoors() {
        // given
        openFirstThreeDoorsInCorridor();

        List<Door> expectedOpenedDoors = new ArrayList<>();
        expectedOpenedDoors.add(doors.get(0));
        expectedOpenedDoors.add(doors.get(1));
        expectedOpenedDoors.add(doors.get(2));

        List<Door> expectedClosedDoors = new ArrayList<>();
        expectedClosedDoors.add(doors.get(3));
        expectedClosedDoors.add(doors.get(4));

        // when
        List<Door> openedDoors = corridor.getDoorsWithStatus(doors, DoorStatus.OPEN);
        List<Door> closedDoors = corridor.getDoorsWithStatus(doors, DoorStatus.CLOSED);

        // then
        assertEquals(expectedOpenedDoors, openedDoors);
        assertEquals(expectedClosedDoors, closedDoors);
    }

    @Test
    void getRoomNumbers_shouldReturnListWithRoomNumbers() {
        // given
        openFirstThreeDoorsInCorridor();
        List<Integer> expectedRoomNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // when
        List<Integer> roomNumbers = corridor.getRoomNumbers(doors);

        // then
        assertEquals(expectedRoomNumbers, roomNumbers);
    }

    private void openFirstThreeDoorsInCorridor() {
        doors.get(0).toggle();
        doors.get(1).toggle();
        doors.get(2).toggle();
    }
}
