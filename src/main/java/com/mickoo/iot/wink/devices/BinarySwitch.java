package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class BinarySwitch extends WinkDevice {

    private Boolean binary_switch_id;
    private Boolean powered;

    public BinarySwitch() {
    }

    public Boolean getBinary_switch_id() {
        return binary_switch_id;
    }

    public void setBinary_switch_id(Boolean binary_switch_id) {
        this.binary_switch_id = binary_switch_id;
    }

    public Boolean getPowered() {
        return powered;
    }

    public void setPowered(Boolean powered) {
        this.powered = powered;
    }
}
