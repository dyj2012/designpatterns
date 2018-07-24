package com.duyj.designpatterns.behavior.classstate.state;

import com.duyj.designpatterns.behavior.classstate.state.impl.CloseDoorState;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class Door {

    DoorState state = new CloseDoorState();

    public void changeState(DoorState doorState) {
        this.state = doorState;
    }

    public void open() {
        state.openDoor(this);
    }

    public void close() {
        state.closeDoor(this);
    }

    public void printDoorState() {
        System.out.println(state.getDoorState());
    }
}
