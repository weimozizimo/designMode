package com.wyf.order_pattern.order;

import com.wyf.order_pattern.entity.Door;

public class DoorCloseCommand implements ICommand {

    private Door door;

    public void setDoor(Door door){
        this.door = door;
    }

    public void execute() {
        door.closeDoor();
    }

    public void undo() {
        door.openDoor();
    }
}
