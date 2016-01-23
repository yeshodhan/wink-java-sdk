package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Doorbell extends WinkDevice {

    private String doorbell_id;
    private Boolean button_pressed;
    private Boolean motion;
    private Double battery;

    public Doorbell() {
    }

    public String getDoorbell_id() {
        return doorbell_id;
    }

    public void setDoorbell_id(String doorbell_id) {
        this.doorbell_id = doorbell_id;
    }

    public Boolean getButton_pressed() {
        return button_pressed;
    }

    public void setButton_pressed(Boolean button_pressed) {
        this.button_pressed = button_pressed;
    }

    public Boolean getMotion() {
        return motion;
    }

    public void setMotion(Boolean motion) {
        this.motion = motion;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }
}
