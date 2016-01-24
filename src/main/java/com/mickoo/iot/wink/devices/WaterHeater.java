package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class WaterHeater extends WinkDevice {

    private WaterHeaterDesiredState desired_state;
    private WaterHeaterLastReading last_reading;

    public WaterHeater() {
    }

    public WaterHeaterDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(WaterHeaterDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public WaterHeaterLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(WaterHeaterLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class WaterHeaterDesiredState extends DesiredState {
        private Mode mode;
        private Boolean powered;
        private Double set_point;
        private Boolean vacation_mode;

        public WaterHeaterDesiredState() {
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

        public Double getSet_point() {
            return set_point;
        }

        public void setSet_point(Double set_point) {
            this.set_point = set_point;
        }

        public Boolean getVacation_mode() {
            return vacation_mode;
        }

        public void setVacation_mode(Boolean vacation_mode) {
            this.vacation_mode = vacation_mode;
        }
    }

    public static class WaterHeaterLastReading extends DesiredState {
        private Double min_set_point_allowed;
        private Double max_set_point_allowed;
        private List<String> modes_allowed;
        private String scald_message;
        private String rheem_type; //one of "Electric Water Heater", "Heat Pump Water Heater", "Gas Water Heater"

        public WaterHeaterLastReading() {
        }

        public Double getMin_set_point_allowed() {
            return min_set_point_allowed;
        }

        public void setMin_set_point_allowed(Double min_set_point_allowed) {
            this.min_set_point_allowed = min_set_point_allowed;
        }

        public Double getMax_set_point_allowed() {
            return max_set_point_allowed;
        }

        public void setMax_set_point_allowed(Double max_set_point_allowed) {
            this.max_set_point_allowed = max_set_point_allowed;
        }

        public List<String> getModes_allowed() {
            return modes_allowed;
        }

        public void setModes_allowed(List<String> modes_allowed) {
            this.modes_allowed = modes_allowed;
        }

        public String getScald_message() {
            return scald_message;
        }

        public void setScald_message(String scald_message) {
            this.scald_message = scald_message;
        }

        public String getRheem_type() {
            return rheem_type;
        }

        public void setRheem_type(String rheem_type) {
            this.rheem_type = rheem_type;
        }
    }

    public enum Mode {
        eco, performance, heat_pump, high_demand, electric_only, gas
    }

}
