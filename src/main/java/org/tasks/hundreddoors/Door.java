package org.tasks.hundreddoors;

public class Door {

    private DoorStatus status = DoorStatus.CLOSED;
    private int roomNumber = 0;

    public Door() {}

    public void toggle() {
        DoorStatus status = (this.status == DoorStatus.CLOSED) ? DoorStatus.OPEN : DoorStatus.CLOSED;
        setStatus(status);
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    public DoorStatus getStatus() {
        return this.status;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
