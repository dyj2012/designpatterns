package com.duyj.designpatterns.behavior.classstate.state;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public abstract class DoorState {
    private DoorState doorState;

    public abstract void openDoor(Door door);

    public abstract void closeDoor(Door door);

    public abstract String getDoorState();

}
