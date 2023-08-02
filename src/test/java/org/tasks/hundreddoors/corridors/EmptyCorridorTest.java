package org.tasks.hundreddoors.corridors;

import org.junit.jupiter.api.Test;
import org.tasks.hundreddoors.Corridor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyCorridorTest {

    final Corridor corridor = new Corridor();

    @Test
    void newCorridor_shouldBeEmpty(){
        assertEquals(0, corridor.getDoors().size());
    }

    @Test
    void createDoors_shouldAddDoorsToCorridor() {
        corridor.createDoors(5);

        assertEquals(5, corridor.getDoors().size());
    }
}
