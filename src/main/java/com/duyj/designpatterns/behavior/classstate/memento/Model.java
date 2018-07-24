package com.duyj.designpatterns.behavior.classstate.memento;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class Model {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento getStateMemento() {
        return new Memento(state);
    }

    public void recoveryState(Memento memento) {
        this.state = memento.getValue();
    }

    @Override
    public String toString() {
        return "Model{" +
                "state='" + state + '\'' +
                '}';
    }
}
