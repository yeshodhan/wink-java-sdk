package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Refuel extends WinkDevice {

    private Double tare;
    private Long tank_changed_at;
    private RefuelLastReading last_reading;

    public Refuel() {
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

    public RefuelLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(RefuelLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class RefuelLastReading extends LastReading {
        private Boolean connection;
        private Double battery;
        private Double remaining;

        public RefuelLastReading() {
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

        public Double getRemaining() {
            return remaining;
        }

        public void setRemaining(Double remaining) {
            this.remaining = remaining;
        }
    }


}
