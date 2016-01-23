package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Camera extends WinkDevice {

    private String camera_id;
    private Boolean capturing_video;
    private Boolean capturing_audio;
    private Mode mode; //one of "armed", "disarmed", "privacy"

    private Boolean motion;
    private Boolean loudness;
    private Boolean connection;
    
    public enum Mode {
        armed, disarmed, privacy
    }

    public Camera() {
    }

    public String getCamera_id() {
        return camera_id;
    }

    public void setCamera_id(String camera_id) {
        this.camera_id = camera_id;
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

    @Override
    public Boolean getConnection() {
        return connection;
    }

    @Override
    public void setConnection(Boolean connection) {
        this.connection = connection;
    }
}
