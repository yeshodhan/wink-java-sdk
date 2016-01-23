package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class PiggyBank extends WinkDevice {

    private String piggy_bank_id;
    private String color;

    private Double battery;
    private Boolean vibration;

    public PiggyBank() {
    }

    public String getPiggy_bank_id() {
        return piggy_bank_id;
    }

    public void setPiggy_bank_id(String piggy_bank_id) {
        this.piggy_bank_id = piggy_bank_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Boolean getVibration() {
        return vibration;
    }

    public void setVibration(Boolean vibration) {
        this.vibration = vibration;
    }
}
