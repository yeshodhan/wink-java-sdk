package com.mickoo.iot.wink.devices;

import com.mickoo.iot.wink.WinkObject;
import com.mickoo.iot.wink.capabilities.Capability;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class WinkDevice extends WinkObject{

    private String manufacturer_device_model;
    private String manufatcurer_device_id;
    private String hub_id;
    private String local_id;
    private String radio_type; //currently only for devices with hub, available values "zigbee", "zwave", "lutron", "wink_project_one"
    private String device_manufacturer;
    private Capability capabilities;

    public WinkDevice() {
    }

    public String getManufacturer_device_model() {
        return manufacturer_device_model;
    }

    public void setManufacturer_device_model(String manufacturer_device_model) {
        this.manufacturer_device_model = manufacturer_device_model;
    }

    public String getManufatcurer_device_id() {
        return manufatcurer_device_id;
    }

    public void setManufatcurer_device_id(String manufatcurer_device_id) {
        this.manufatcurer_device_id = manufatcurer_device_id;
    }

    public String getHub_id() {
        return hub_id;
    }

    public void setHub_id(String hub_id) {
        this.hub_id = hub_id;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    public String getRadio_type() {
        return radio_type;
    }

    public void setRadio_type(String radio_type) {
        this.radio_type = radio_type;
    }

    public String getDevice_manufacturer() {
        return device_manufacturer;
    }

    public void setDevice_manufacturer(String device_manufacturer) {
        this.device_manufacturer = device_manufacturer;
    }

    public Capability getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capability capabilities) {
        this.capabilities = capabilities;
    }
}
