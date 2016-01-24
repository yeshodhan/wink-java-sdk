package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Remote extends WinkDevice {

    private RemoteLastReading last_reading;

    public Remote() {
    }

    public RemoteLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(RemoteLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class RemoteLastReading extends LastReading {
        private Boolean connection;
        private Boolean remote_pairable;
        private String group_id;
        private Boolean button_up_pressed;
        private Boolean button_down_pressed;
        private Boolean button_on_pressed;
        private Boolean button_off_pressed;

        public RemoteLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }

        public Boolean getRemote_pairable() {
            return remote_pairable;
        }

        public void setRemote_pairable(Boolean remote_pairable) {
            this.remote_pairable = remote_pairable;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public Boolean getButton_up_pressed() {
            return button_up_pressed;
        }

        public void setButton_up_pressed(Boolean button_up_pressed) {
            this.button_up_pressed = button_up_pressed;
        }

        public Boolean getButton_down_pressed() {
            return button_down_pressed;
        }

        public void setButton_down_pressed(Boolean button_down_pressed) {
            this.button_down_pressed = button_down_pressed;
        }

        public Boolean getButton_on_pressed() {
            return button_on_pressed;
        }

        public void setButton_on_pressed(Boolean button_on_pressed) {
            this.button_on_pressed = button_on_pressed;
        }

        public Boolean getButton_off_pressed() {
            return button_off_pressed;
        }

        public void setButton_off_pressed(Boolean button_off_pressed) {
            this.button_off_pressed = button_off_pressed;
        }
    }
}
