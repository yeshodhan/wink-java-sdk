package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class AirConditioner extends WinkDevice {

    private AirConditionerDesiredState desired_state;
    private AirConditionerLastReading last_reading;

    public AirConditioner() {
    }

    public AirConditionerDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(AirConditionerDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public AirConditionerLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(AirConditionerLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class AirConditionerDesiredState extends DesiredState{

        private Double fan_speed;
        private Mode mode;
        private Boolean powered;
        private Double max_set_point;

        public AirConditionerDesiredState() {
        }

        public Double getFan_speed() {
            return fan_speed;
        }

        public void setFan_speed(Double fan_speed) {
            this.fan_speed = fan_speed;
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

        public Double getMax_set_point() {
            return max_set_point;
        }

        public void setMax_set_point(Double max_set_point) {
            this.max_set_point = max_set_point;
        }

        public enum Mode {
            cool_only, fan_only, auto_eco
        }
    }

    public static class AirConditionerLastReading extends LastReading{

        private Boolean connection;
        private Double temperature;
        private Double consumption;

        public AirConditionerLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }

        public Double getTemperature() {
            return temperature;
        }

        public void setTemperature(Double temperature) {
            this.temperature = temperature;
        }

        public Double getConsumption() {
            return consumption;
        }

        public void setConsumption(Double consumption) {
            this.consumption = consumption;
        }
    }


}
