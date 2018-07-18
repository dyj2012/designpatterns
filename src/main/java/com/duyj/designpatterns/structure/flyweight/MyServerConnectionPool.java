package com.duyj.designpatterns.structure.flyweight;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class MyServerConnectionPool {
    List<ServerConnection> list = new ArrayList<>(10);

    public ServerConnection getServerConnection() {
        ServerConnection serverConnection = null;
        if (list.size() > 0) {
            int index = 0;
            serverConnection = list.get(index);
            while (!serverConnection.isUsing()) {
                index++;
                if (index >= list.size()) {
                    break;
                }
                serverConnection = list.get(index);
            }
        }

        if (serverConnection == null) {
            serverConnection = new ServerConnection("serName", "123");
            list.add(serverConnection);
        }
        serverConnection.setUsing(true);
        return serverConnection;
    }
}
