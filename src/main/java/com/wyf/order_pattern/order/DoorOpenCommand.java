package com.wyf.order_pattern.order;

import com.wyf.order_pattern.entity.Door;
import com.wyf.order_pattern.order.ICommand;
import org.omg.CORBA.PRIVATE_MEMBER;

public class DoorOpenCommand implements ICommand {

    private Door door;

    public void setDoor(Door door){
        this.door = door;
    }


    public void execute() {
        door.openDoor();
    }

    public void undo() {
        door.closeDoor();
    }
}
