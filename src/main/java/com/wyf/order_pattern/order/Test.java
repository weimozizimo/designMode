package com.wyf.order_pattern.order;

import com.wyf.order_pattern.entity.Door;
import com.wyf.order_pattern.entity.Light;

import java.util.Stack;

public class Test {
    public static Stack<ICommand> commands = new Stack<ICommand>();

    public static void main(String[] args) {
        Door door = new Door();
        Light light = new Light();

        DoorOpenCommand doorOpenCommand = new DoorOpenCommand();
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand();
        doorOpenCommand.setDoor(door);
        doorCloseCommand.setDoor(door);
        LightOnCommand lightOnCommand = new LightOnCommand();
        LightOffCommand lightOffCommand = new LightOffCommand();
        lightOnCommand.setLight(light);
        lightOffCommand.setLight(light);

        //开门
        handleCommand(true,doorOpenCommand,doorCloseCommand);



    }

    public static void handleCommand(boolean isChecked,ICommand openCommand,ICommand closeCommand){
        if(isChecked){
            commands.push(openCommand);
            openCommand.execute();
        }else {
            commands.push(closeCommand);
            closeCommand.execute();
        }
    }
}
