package com.duyj.designpatterns.structure.flyweight;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class ServerConnection {

    private String name;
    private String password;
    private boolean using;

    public ServerConnection(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void init() {
        System.out.println(String.format("name:%s,password:%s connecting", name, password));
    }

    public void executeSql(String sql) {
        System.out.println("execute sql:" + sql);
    }

    public boolean isUsing() {
        return using;
    }

    public void setUsing(boolean using) {
        this.using = using;
    }

    public void close() {
        this.using = false;
    }
}
