package com.duyj.designpatterns.structure.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class MyServerConnectionPoolTest {

    @Test
    public void getServerConnection() {
        MyServerConnectionPool myServerConnectionPool = new MyServerConnectionPool();
        ServerConnection serverConnection = myServerConnectionPool.getServerConnection();
        serverConnection.executeSql("select 1");
        serverConnection.close();
    }
}