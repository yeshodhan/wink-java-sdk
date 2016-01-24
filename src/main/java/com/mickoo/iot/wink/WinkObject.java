package com.mickoo.iot.wink;

import com.mickoo.iot.wink.subscriptions.Subscription;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class WinkObject {

    private String object_type;
    private String object_id;
    private String name;
    private String locale;
    private Object units; //todo
    private Long created_at;
    private Subscription subscription;
    private List<Double> lat_lng;
    private String location;

    public WinkObject() {
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getUnits() {
        return units;
    }

    public void setUnits(Object units) {
        this.units = units;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public List<Double> getLat_lng() {
        return lat_lng;
    }

    public void setLat_lng(List<Double> lat_lng) {
        this.lat_lng = lat_lng;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
