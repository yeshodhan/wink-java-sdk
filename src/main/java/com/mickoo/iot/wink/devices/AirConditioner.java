package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class AirConditioner extends WinkDevice {

    private String air_conditioner_id;
    private Double fan_speed;
    private Mode mode; //"cool_only", "fan_only", "auto_eco"
    private Boolean powered;
    private Double max_set_point;

    private Double temperature;
    private Double consumption;
    
    public enum Mode {
        cool_only, fan_only, auto_eco
    }

    public AirConditioner() {
    }

    public String getAir_conditioner_id() {
        return air_conditioner_id;
    }

    public void setAir_conditioner_id(String air_conditioner_id) {
        this.air_conditioner_id = air_conditioner_id;
    }

    public Double getFan_speed() {
        return fan_speed;
    }

    public void setFan_speed(Double fan_speed) {
        this.fan_speed = fan_speed;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public Boolean getPowered() {
        return powered;
    }

    public void setPowered(Boolean powered) {
        this.powered = powered;
    }

    public Double getMax_set_point() {
        return max_set_point;
    }

    public void setMax_set_point(Double max_set_point) {
        this.max_set_point = max_set_point;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }
}
