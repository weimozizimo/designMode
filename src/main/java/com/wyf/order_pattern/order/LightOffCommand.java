package com.wyf.order_pattern.order;

import com.wyf.order_pattern.entity.Light;

public class LightOffCommand implements ICommand {

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOff();
    }

    public void undo() {
        light.lightOn();
    }
}
