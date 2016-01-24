package com.mickoo.iot.wink.capabilities;

import com.mickoo.iot.wink.WinkObject;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Capability extends WinkObject {

    private List<Field> fields;

    public Capability() {
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
