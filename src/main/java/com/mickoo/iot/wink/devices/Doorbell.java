package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Doorbell extends WinkDevice {

    private DoorbellDesiredState desired_state;

    public Doorbell() {
    }

    public DoorbellDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(DoorbellDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public static class DoorbellDesiredState extends DesiredState {
        private Boolean button_pressed;
        private Boolean motion;
        private Double battery;
        private Boolean connection;

        public DoorbellDesiredState() {
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

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }
}
