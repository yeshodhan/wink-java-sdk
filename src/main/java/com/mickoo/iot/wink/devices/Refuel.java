package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Refuel extends WinkDevice {

    private String propane_tank_id;
    private Double tare;
    private Long tank_changed_at;

    private Double battery;
    private Double remaining;

    public Refuel() {
    }

    public String getPropane_tank_id() {
        return propane_tank_id;
    }

    public void setPropane_tank_id(String propane_tank_id) {
        this.propane_tank_id = propane_tank_id;
    }

    public Double getTare() {
        return tare;
    }

    public void setTare(Double tare) {
        this.tare = tare;
    }

    public Long getTank_changed_at() {
        return tank_changed_at;
    }

    public void setTank_changed_at(Long tank_changed_at) {
        this.tank_changed_at = tank_changed_at;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Double getRemaining() {
        return remaining;
    }

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }
}
