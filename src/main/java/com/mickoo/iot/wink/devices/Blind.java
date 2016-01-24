package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Blind extends WinkDevice {

    BlindDesiredState desired_state;
    BlindLastReading last_reading;

    public Blind() {
    }

    public BlindDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(BlindDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public BlindLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(BlindLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class BlindDesiredState extends DesiredState {
        private Double position; //0.0 is completely closed and 1.0 is completely open.

        public Double getPosition() {
            return position;
        }

        public void setPosition(Double position) {
            this.position = position;
        }
    }

    public static class BlindLastReading extends LastReading {

        private Boolean connection;

        public BlindLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }


}
