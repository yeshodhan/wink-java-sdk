package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class EggMinder extends WinkDevice {

    private Integer freshness_period;
    private List<Integer> eggs;
    private EggMinderLastReading last_reading;

    public EggMinder() {
    }

    public Integer getFreshness_period() {
        return freshness_period;
    }

    public void setFreshness_period(Integer freshness_period) {
        this.freshness_period = freshness_period;
    }

    public List<Integer> getEggs() {
        return eggs;
    }

    public void setEggs(List<Integer> eggs) {
        this.eggs = eggs;
    }

    public EggMinderLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(EggMinderLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class EggMinderLastReading extends LastReading {
        private Double battery;
        private Integer inventory;
        private Integer freshness_remaining;
        private Boolean connection;

        public EggMinderLastReading() {
        }

        public Double getBattery() {
            return battery;
        }

        public void setBattery(Double battery) {
            this.battery = battery;
        }

        public Integer getInventory() {
            return inventory;
        }

        public void setInventory(Integer inventory) {
            this.inventory = inventory;
        }

        public Integer getFreshness_remaining() {
            return freshness_remaining;
        }

        public void setFreshness_remaining(Integer freshness_remaining) {
            this.freshness_remaining = freshness_remaining;
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }
}
