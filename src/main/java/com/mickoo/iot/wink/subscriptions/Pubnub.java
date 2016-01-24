package com.mickoo.iot.wink.subscriptions;

import com.mickoo.iot.wink.WinkObject;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Pubnub extends WinkObject {

    private String subscribe_key;
    private String channel;

    public Pubnub() {
    }

    public String getSubscribe_key() {
        return subscribe_key;
    }

    public void setSubscribe_key(String subscribe_key) {
        this.subscribe_key = subscribe_key;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
