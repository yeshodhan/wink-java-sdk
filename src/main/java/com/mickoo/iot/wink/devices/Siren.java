package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Siren extends WinkDevice {

    private String siren_id;

    private String mode;
    private Boolean powered;
    private Integer auto_shutoff;

    private Double battery;

    public Siren() {
    }

    public String getSiren_id() {
        return siren_id;
    }

    public void setSiren_id(String siren_id) {
        this.siren_id = siren_id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getPowered() {
        return powered;
    }

    public void setPowered(Boolean powered) {
        this.powered = powered;
    }

    public Integer getAuto_shutoff() {
        return auto_shutoff;
    }

    public void setAuto_shutoff(Integer auto_shutoff) {
        this.auto_shutoff = auto_shutoff;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }
}
