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

    private String power_strip_id;
    private List<Outlet> outlets;

    public PowerStrip() {
    }

    public String getPower_strip_id() {
        return power_strip_id;
    }

    public void setPower_strip_id(String power_strip_id) {
        this.power_strip_id = power_strip_id;
    }

    public List<Outlet> getOutlets() {
        return outlets;
    }

    public void setOutlets(List<Outlet> outlets) {
        this.outlets = outlets;
    }

    public static class Outlet {
        private String outlet_id;
        private Integer outlet_index;
        private Boolean powered;

        public Outlet() {
        }

        public String getOutlet_id() {
            return outlet_id;
        }

        public void setOutlet_id(String outlet_id) {
            this.outlet_id = outlet_id;
        }

        public Integer getOutlet_index() {
            return outlet_index;
        }

        public void setOutlet_index(Integer outlet_index) {
            this.outlet_index = outlet_index;
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }
    }

}
