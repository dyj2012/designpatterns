package com.duyj.designpatterns.behavior.classstate.state.impl;

import com.duyj.designpatterns.behavior.classstate.state.Door;
import com.duyj.designpatterns.behavior.classstate.state.DoorState;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class CloseDoorState extends DoorState {
    @Override
    public void openDoor(Door door) {
        System.out.println("open door");
        door.changeState(new OpenDoorState());
    }

    @Override
    public void closeDoor(Door door) {
        System.out.println("door is close!");
    }

    @Override
    public String getDoorState() {
        return "door state is close";
    }
}
