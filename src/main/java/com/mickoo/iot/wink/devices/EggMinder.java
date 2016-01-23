package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class EggMinder extends WinkDevice {

    private String eggtray_id;
    private Integer freshness_period;
    private List<Integer> eggs;

    private Double battery;
    private Integer inventory;
    private Integer freshness_remaining;

    public EggMinder() {
    }

    public String getEggtray_id() {
        return eggtray_id;
    }

    public void setEggtray_id(String eggtray_id) {
        this.eggtray_id = eggtray_id;
    }

    public Integer getFreshness_period() {
        return freshness_period;
    }

    public void setFreshness_period(Integer freshness_period) {
        this.freshness_period = freshness_period;
    }

    public List<Integer> getEggs() {
        return eggs;
    }

    public void setEggs(List<Integer> eggs) {
        this.eggs = eggs;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getFreshness_remaining() {
        return freshness_remaining;
    }

    public void setFreshness_remaining(Integer freshness_remaining) {
        this.freshness_remaining = freshness_remaining;
    }
}
