package org.tasks.hundreddoors;

import java.util.List;

public class Janitor {

    public List<Door> visitDoors( List<Door> doors) {
        toggleEveryNthDoorOnEveryNthPass(doors);
        return doors;
    }

    private static void toggleEveryNthDoorOnEveryNthPass(List<Door> doors) {
        for (int passNumber = 1; passNumber <= doors.size(); passNumber++) {
            for (Door door : doors) {
                if (roomShouldBeToggledOnPass(door, passNumber)) {
                    door.toggle();
                }
            }
        }
    }

    private static boolean roomShouldBeToggledOnPass(Door door, int passNumber) {
        return door.getRoomNumber() % passNumber == 0;
    }
}
