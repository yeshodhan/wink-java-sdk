package com.mickoo.iot.wink.subscriptions;

import com.mickoo.iot.wink.WinkObject;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Subscription extends WinkObject {

    private Pubnub pubnub;

    public Subscription() {
    }

    public Pubnub getPubnub() {
        return pubnub;
    }

    public void setPubnub(Pubnub pubnub) {
        this.pubnub = pubnub;
    }
}
