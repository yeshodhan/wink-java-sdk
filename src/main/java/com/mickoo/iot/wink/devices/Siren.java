package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Siren extends WinkDevice {

    private SirenDesiredState desired_state;
    private SirenLastReading last_reading;

    public Siren() {
    }

    public SirenDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(SirenDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public SirenLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(SirenLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class SirenDesiredState extends DesiredState {
        private String mode;
        private Boolean powered;
        private Integer auto_shutoff;

        public SirenDesiredState() {
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
    }

    public static class SirenLastReading extends LastReading {
        private Double battery;
        private Boolean connection;

        public SirenLastReading() {
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
