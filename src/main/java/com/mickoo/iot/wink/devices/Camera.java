package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Camera extends WinkDevice {

    private CameraDesiredState desired_state;
    private CameraLastReading last_reading;

    public Camera() {
    }

    public CameraDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(CameraDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public CameraLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(CameraLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class CameraDesiredState extends DesiredState {
        private Boolean capturing_video;
        private Boolean capturing_audio;
        private Mode mode; //one of "armed", "disarmed", "privacy"

        public CameraDesiredState() {
        }

        public Boolean getCapturing_video() {
            return capturing_video;
        }

        public void setCapturing_video(Boolean capturing_video) {
            this.capturing_video = capturing_video;
        }

        public Boolean getCapturing_audio() {
            return capturing_audio;
        }

        public void setCapturing_audio(Boolean capturing_audio) {
            this.capturing_audio = capturing_audio;
        }

        public Mode getMode() {
            return mode;
        }

        public void setMode(Mode mode) {
            this.mode = mode;
        }
    }

    public static class CameraLastReading extends LastReading {
        private Boolean motion;
        private Boolean loudness;
        private Boolean connection;

        public CameraLastReading() {
        }

        public Boolean getMotion() {
            return motion;
        }

        public void setMotion(Boolean motion) {
            this.motion = motion;
        }

        public Boolean getLoudness() {
            return loudness;
        }

        public void setLoudness(Boolean loudness) {
            this.loudness = loudness;
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }

    public enum Mode {
        armed, disarmed, privacy
    }
}
