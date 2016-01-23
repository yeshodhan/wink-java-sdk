package com.mickoo.iot.wink.members;

import com.mickoo.iot.wink.WinkObject;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Member extends WinkObject {

    private String object_id;
    private String object_type;
    private Object desired_state;
    private List<String> blacklisted_readings;

    public Member() {
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public Object getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(Object desired_state) {
        this.desired_state = desired_state;
    }

    public List<String> getBlacklisted_readings() {
        return blacklisted_readings;
    }

    public void setBlacklisted_readings(List<String> blacklisted_readings) {
        this.blacklisted_readings = blacklisted_readings;
    }
}
