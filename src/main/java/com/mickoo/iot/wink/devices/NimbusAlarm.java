package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class NimbusAlarm extends WinkDevice{

    private String alarm_id;
    private String cloud_clock_id;
    private String name;
    private String recurrence;
    private Boolean enabled;
    private Double next_at;

    public NimbusAlarm() {
    }

    public String getAlarm_id() {
        return alarm_id;
    }

    public void setAlarm_id(String alarm_id) {
        this.alarm_id = alarm_id;
    }

    public String getCloud_clock_id() {
        return cloud_clock_id;
    }

    public void setCloud_clock_id(String cloud_clock_id) {
        this.cloud_clock_id = cloud_clock_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Double getNext_at() {
        return next_at;
    }

    public void setNext_at(Double next_at) {
        this.next_at = next_at;
    }
}
