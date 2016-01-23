package com.mickoo.iot.wink.devices;

import com.mickoo.iot.wink.WinkObject;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class WinkDevice extends WinkObject{

    private Boolean connection;

    public WinkDevice() {
    }

    public Boolean getConnection() {
        return connection;
    }

    public void setConnection(Boolean connection) {
        this.connection = connection;
    }
}
