package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Blind extends WinkDevice {

    private String shade_id;
    private Double position; //0.0 is completely closed and 1.0 is completely open.

    public Blind() {
    }

    public String getShade_id() {
        return shade_id;
    }

    public void setShade_id(String shade_id) {
        this.shade_id = shade_id;
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }


}
