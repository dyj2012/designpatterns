package com.duyj.designpatterns.behavior.classstate.state;

import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class DoorTest {

    @Test
    public void doorOpenCloseTest() {
        Door door = new Door();
        door.printDoorState();
        door.open();
        door.printDoorState();
        door.close();
        door.printDoorState();
        door.close();
    }
}