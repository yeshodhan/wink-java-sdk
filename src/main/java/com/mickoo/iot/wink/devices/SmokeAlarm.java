package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class SmokeAlarm extends WinkDevice {

    private String smoke_detector_id;

    private Boolean smoke_detected;
    private Boolean co_detected;
    private Boolean test_activated;
    private Double battery;
    private Double smoke_severity;
    private Double co_severity;

    public SmokeAlarm() {
    }

    public String getSmoke_detector_id() {
        return smoke_detector_id;
    }

    public void setSmoke_detector_id(String smoke_detector_id) {
        this.smoke_detector_id = smoke_detector_id;
    }

    public Boolean getSmoke_detected() {
        return smoke_detected;
    }

    public void setSmoke_detected(Boolean smoke_detected) {
        this.smoke_detected = smoke_detected;
    }

    public Boolean getCo_detected() {
        return co_detected;
    }

    public void setCo_detected(Boolean co_detected) {
        this.co_detected = co_detected;
    }

    public Boolean getTest_activated() {
        return test_activated;
    }

    public void setTest_activated(Boolean test_activated) {
        this.test_activated = test_activated;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Double getSmoke_severity() {
        return smoke_severity;
    }

    public void setSmoke_severity(Double smoke_severity) {
        this.smoke_severity = smoke_severity;
    }

    public Double getCo_severity() {
        return co_severity;
    }

    public void setCo_severity(Double co_severity) {
        this.co_severity = co_severity;
    }
}
