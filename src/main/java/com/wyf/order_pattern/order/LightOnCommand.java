package com.wyf.order_pattern.order;

import com.wyf.order_pattern.entity.Light;

public class LightOnCommand implements ICommand {

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }

    public void undo() {
        light.lightOff();
    }
}
