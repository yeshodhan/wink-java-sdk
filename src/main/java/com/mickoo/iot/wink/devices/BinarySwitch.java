package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class BinarySwitch extends WinkDevice {

    private BinarySwitchDesiredState desired_state;
    private BinarySwitchLastReading last_reading;


    public BinarySwitch() {
    }

    public BinarySwitchDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(BinarySwitchDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public BinarySwitchLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(BinarySwitchLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class BinarySwitchDesiredState extends DesiredState{

        private Boolean powered;

        public BinarySwitchDesiredState() {
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }

    }

    public static class BinarySwitchLastReading extends LastReading {

        private Boolean connection;

        public BinarySwitchLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }

}
