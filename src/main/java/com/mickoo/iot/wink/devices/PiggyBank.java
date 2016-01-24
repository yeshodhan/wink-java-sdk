package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class PiggyBank extends WinkDevice {

    private String color;
    private PiggyBankLastReading last_reading;

    public PiggyBank() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PiggyBankLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(PiggyBankLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class PiggyBankLastReading extends LastReading {
        private Boolean connection;
        private Double battery;
        private Boolean vibration;

        public PiggyBankLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
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
}
