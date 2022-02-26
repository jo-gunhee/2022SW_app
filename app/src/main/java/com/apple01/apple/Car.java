package com.apple01.apple;

public class Car {

    public int speed;
    public String model;
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int upSpeed(){
        speed = speed+1;
        return speed;
    }

    public int downSpeed(){
        speed = speed-1;
        return speed;
    }

}
