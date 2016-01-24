package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Refrigerator extends WinkDevice {

    private RefrigeratorDesiredState desired_state;
    private RefrigeratorLastReading last_reading;

    public Refrigerator() {
    }

    public RefrigeratorDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(RefrigeratorDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public RefrigeratorLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(RefrigeratorLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class RefrigeratorDesiredState extends DesiredState {
        private Double refrigerator_set_point;
        private Double freezer_set_point;
        private Boolean refrigerator_ice_maker_enabled;
        private Boolean freezer_ice_maker_enabled;
        private Boolean sabbath_mode_enabled;

        public RefrigeratorDesiredState() {
        }

        public Double getRefrigerator_set_point() {
            return refrigerator_set_point;
        }

        public void setRefrigerator_set_point(Double refrigerator_set_point) {
            this.refrigerator_set_point = refrigerator_set_point;
        }

        public Double getFreezer_set_point() {
            return freezer_set_point;
        }

        public void setFreezer_set_point(Double freezer_set_point) {
            this.freezer_set_point = freezer_set_point;
        }

        public Boolean getRefrigerator_ice_maker_enabled() {
            return refrigerator_ice_maker_enabled;
        }

        public void setRefrigerator_ice_maker_enabled(Boolean refrigerator_ice_maker_enabled) {
            this.refrigerator_ice_maker_enabled = refrigerator_ice_maker_enabled;
        }

        public Boolean getFreezer_ice_maker_enabled() {
            return freezer_ice_maker_enabled;
        }

        public void setFreezer_ice_maker_enabled(Boolean freezer_ice_maker_enabled) {
            this.freezer_ice_maker_enabled = freezer_ice_maker_enabled;
        }

        public Boolean getSabbath_mode_enabled() {
            return sabbath_mode_enabled;
        }

        public void setSabbath_mode_enabled(Boolean sabbath_mode_enabled) {
            this.sabbath_mode_enabled = sabbath_mode_enabled;
        }
    }

    public static class RefrigeratorLastReading extends LastReading {
        private Double min_refrigerator_set_point_allowed;
        private Double max_refrigerator_set_point_allowed;
        private Double min_freezer_set_point_allowed;
        private Double max_freezer_set_point_allowed;
        private Boolean refrigerator_left_door_ajar;
        private Boolean refrigerator_right_door_ajar;
        private Boolean refrigerator_door_ajar;
        private Boolean freezer_door_ajar;
        private Double water_filter_remaining;
        private String firmware_version;
        private Boolean update_needed;
        private Boolean updating_firmware;
        private String symbiote_firmware_version;
        private Boolean symbiote_update_needed;
        private Boolean symbiote_updating_firmware;

        public RefrigeratorLastReading() {
        }

        public Double getMin_refrigerator_set_point_allowed() {
            return min_refrigerator_set_point_allowed;
        }

        public void setMin_refrigerator_set_point_allowed(Double min_refrigerator_set_point_allowed) {
            this.min_refrigerator_set_point_allowed = min_refrigerator_set_point_allowed;
        }

        public Double getMax_refrigerator_set_point_allowed() {
            return max_refrigerator_set_point_allowed;
        }

        public void setMax_refrigerator_set_point_allowed(Double max_refrigerator_set_point_allowed) {
            this.max_refrigerator_set_point_allowed = max_refrigerator_set_point_allowed;
        }

        public Double getMin_freezer_set_point_allowed() {
            return min_freezer_set_point_allowed;
        }

        public void setMin_freezer_set_point_allowed(Double min_freezer_set_point_allowed) {
            this.min_freezer_set_point_allowed = min_freezer_set_point_allowed;
        }

        public Double getMax_freezer_set_point_allowed() {
            return max_freezer_set_point_allowed;
        }

        public void setMax_freezer_set_point_allowed(Double max_freezer_set_point_allowed) {
            this.max_freezer_set_point_allowed = max_freezer_set_point_allowed;
        }

        public Boolean getRefrigerator_left_door_ajar() {
            return refrigerator_left_door_ajar;
        }

        public void setRefrigerator_left_door_ajar(Boolean refrigerator_left_door_ajar) {
            this.refrigerator_left_door_ajar = refrigerator_left_door_ajar;
        }

        public Boolean getRefrigerator_right_door_ajar() {
            return refrigerator_right_door_ajar;
        }

        public void setRefrigerator_right_door_ajar(Boolean refrigerator_right_door_ajar) {
            this.refrigerator_right_door_ajar = refrigerator_right_door_ajar;
        }

        public Boolean getRefrigerator_door_ajar() {
            return refrigerator_door_ajar;
        }

        public void setRefrigerator_door_ajar(Boolean refrigerator_door_ajar) {
            this.refrigerator_door_ajar = refrigerator_door_ajar;
        }

        public Boolean getFreezer_door_ajar() {
            return freezer_door_ajar;
        }

        public void setFreezer_door_ajar(Boolean freezer_door_ajar) {
            this.freezer_door_ajar = freezer_door_ajar;
        }

        public Double getWater_filter_remaining() {
            return water_filter_remaining;
        }

        public void setWater_filter_remaining(Double water_filter_remaining) {
            this.water_filter_remaining = water_filter_remaining;
        }

        public String getFirmware_version() {
            return firmware_version;
        }

        public void setFirmware_version(String firmware_version) {
            this.firmware_version = firmware_version;
        }

        public Boolean getUpdate_needed() {
            return update_needed;
        }

        public void setUpdate_needed(Boolean update_needed) {
            this.update_needed = update_needed;
        }

        public Boolean getUpdating_firmware() {
            return updating_firmware;
        }

        public void setUpdating_firmware(Boolean updating_firmware) {
            this.updating_firmware = updating_firmware;
        }

        public String getSymbiote_firmware_version() {
            return symbiote_firmware_version;
        }

        public void setSymbiote_firmware_version(String symbiote_firmware_version) {
            this.symbiote_firmware_version = symbiote_firmware_version;
        }

        public Boolean getSymbiote_update_needed() {
            return symbiote_update_needed;
        }

        public void setSymbiote_update_needed(Boolean symbiote_update_needed) {
            this.symbiote_update_needed = symbiote_update_needed;
        }

        public Boolean getSymbiote_updating_firmware() {
            return symbiote_updating_firmware;
        }

        public void setSymbiote_updating_firmware(Boolean symbiote_updating_firmware) {
            this.symbiote_updating_firmware = symbiote_updating_firmware;
        }
    }
}
