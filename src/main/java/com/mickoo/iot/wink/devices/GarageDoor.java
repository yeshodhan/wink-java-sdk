package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class GarageDoor extends WinkDevice {

    private String garage_door_id;
    private Double position;
    private Boolean laser;
    private Boolean calibration_enabled;

    private Boolean buzzer;
    private Boolean led;
    private Boolean moving;
    private Boolean fault;
    private Boolean disabled;
    private List<String> error; //todo
    private Boolean control_enabled;
    private List<String> controller_error;
    private List<String> tilt_sensor_error;

    public GarageDoor() {
    }

    public String getGarage_door_id() {
        return garage_door_id;
    }

    public void setGarage_door_id(String garage_door_id) {
        this.garage_door_id = garage_door_id;
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    public Boolean getLaser() {
        return laser;
    }

    public void setLaser(Boolean laser) {
        this.laser = laser;
    }

    public Boolean getCalibration_enabled() {
        return calibration_enabled;
    }

    public void setCalibration_enabled(Boolean calibration_enabled) {
        this.calibration_enabled = calibration_enabled;
    }

    public Boolean getBuzzer() {
        return buzzer;
    }

    public void setBuzzer(Boolean buzzer) {
        this.buzzer = buzzer;
    }

    public Boolean getLed() {
        return led;
    }

    public void setLed(Boolean led) {
        this.led = led;
    }

    public Boolean getMoving() {
        return moving;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public Boolean getFault() {
        return fault;
    }

    public void setFault(Boolean fault) {
        this.fault = fault;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public Boolean getControl_enabled() {
        return control_enabled;
    }

    public void setControl_enabled(Boolean control_enabled) {
        this.control_enabled = control_enabled;
    }

    public List<String> getController_error() {
        return controller_error;
    }

    public void setController_error(List<String> controller_error) {
        this.controller_error = controller_error;
    }

    public List<String> getTilt_sensor_error() {
        return tilt_sensor_error;
    }

    public void setTilt_sensor_error(List<String> tilt_sensor_error) {
        this.tilt_sensor_error = tilt_sensor_error;
    }
}
