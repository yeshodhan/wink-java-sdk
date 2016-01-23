package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Sensor extends WinkDevice {

    private String sensor_pod_id;

    private Double battery;
    private Boolean brightness;
    private Boolean external_power;
    private Double humditity;
    private Boolean loudness;
    private Double temperature;
    private Boolean vibration;
    private Boolean motion;
    private Boolean opened;
    private Boolean locked;
    private Boolean liquid_detected;
    private Boolean occupied;

    public Sensor() {
    }

    public String getSensor_pod_id() {
        return sensor_pod_id;
    }

    public void setSensor_pod_id(String sensor_pod_id) {
        this.sensor_pod_id = sensor_pod_id;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Boolean getBrightness() {
        return brightness;
    }

    public void setBrightness(Boolean brightness) {
        this.brightness = brightness;
    }

    public Boolean getExternal_power() {
        return external_power;
    }

    public void setExternal_power(Boolean external_power) {
        this.external_power = external_power;
    }

    public Double getHumditity() {
        return humditity;
    }

    public void setHumditity(Double humditity) {
        this.humditity = humditity;
    }

    public Boolean getLoudness() {
        return loudness;
    }

    public void setLoudness(Boolean loudness) {
        this.loudness = loudness;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean getVibration() {
        return vibration;
    }

    public void setVibration(Boolean vibration) {
        this.vibration = vibration;
    }

    public Boolean getMotion() {
        return motion;
    }

    public void setMotion(Boolean motion) {
        this.motion = motion;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getLiquid_detected() {
        return liquid_detected;
    }

    public void setLiquid_detected(Boolean liquid_detected) {
        this.liquid_detected = liquid_detected;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }
}
