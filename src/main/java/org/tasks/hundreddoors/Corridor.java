package org.tasks.hundreddoors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Corridor {

    private final List<Door> doors = new ArrayList<>();

    public Corridor() {}

    public List<Door> getDoors() {
        return this.doors;
    }

    public List<Door> createDoors(int numberOfRooms) {
        for (int i = 0; i < numberOfRooms; i++) {
            doors.add(createDoorWithRoomNumber(i + 1));
        }
        return this.doors;
    }

    public List<DoorStatus> checkDoors(List<Door> doors) {
        return doors.stream().map(Door::getStatus).collect(Collectors.toList());
    }

    private Door createDoorWithRoomNumber(int roomNumber) {
        Door door = new Door();
        door.setRoomNumber(roomNumber);
        return door;
    }

    public List<Door> getDoorsWithStatus(List<Door> doors, DoorStatus status) {
        return doors.stream().filter(door -> door.getStatus().equals(status)).collect(Collectors.toList());

    }

    public List<Integer> getRoomNumbers(List<Door> doors) {
        return doors.stream().map(Door::getRoomNumber).collect(Collectors.toList());
    }
}
