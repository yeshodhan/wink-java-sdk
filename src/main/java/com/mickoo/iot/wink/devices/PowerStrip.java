package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class PowerStrip extends WinkDevice {

    private List<Outlet> outlets;
    private PowerStripLastReading last_reading;

    public PowerStrip() {
    }

    public List<Outlet> getOutlets() {
        return outlets;
    }

    public void setOutlets(List<Outlet> outlets) {
        this.outlets = outlets;
    }

    public PowerStripLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(PowerStripLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class PowerStripLastReading extends LastReading {
        private Boolean connection;

        public PowerStripLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }

    public static class Outlet extends WinkDevice {

        private Integer outlet_index;
        private OutletLastReading last_reading;

        public Outlet() {
        }

        public Integer getOutlet_index() {
            return outlet_index;
        }

        public void setOutlet_index(Integer outlet_index) {
            this.outlet_index = outlet_index;
        }

        public OutletLastReading getLast_reading() {
            return last_reading;
        }

        public void setLast_reading(OutletLastReading last_reading) {
            this.last_reading = last_reading;
        }
    }

    public static class OutletLastReading extends LastReading {
        private Boolean powered;

        public OutletLastReading() {
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }
    }

}
