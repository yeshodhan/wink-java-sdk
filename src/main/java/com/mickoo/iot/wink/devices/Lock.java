package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Lock extends WinkDevice {

    private String lock_id;
    private Boolean locked;
    private AlarmMode alarm_mode; //null, "activity", "tamper", "forced_entry"
    private Double alarm_sensitivity;
    private Boolean auto_lock_enabled;
    private Boolean beeper_enabled;
    private Boolean vacation_mode;
    private Integer key_code_length;

    private Boolean alarm_activated;
    
    public enum AlarmMode {
        activity, tamper, forced_entry
    }

    public Lock() {
    }

    public String getLock_id() {
        return lock_id;
    }

    public void setLock_id(String lock_id) {
        this.lock_id = lock_id;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public AlarmMode getAlarm_mode() {
        return alarm_mode;
    }

    public void setAlarm_mode(AlarmMode alarm_mode) {
        this.alarm_mode = alarm_mode;
    }

    public Double getAlarm_sensitivity() {
        return alarm_sensitivity;
    }

    public void setAlarm_sensitivity(Double alarm_sensitivity) {
        this.alarm_sensitivity = alarm_sensitivity;
    }

    public Boolean getAuto_lock_enabled() {
        return auto_lock_enabled;
    }

    public void setAuto_lock_enabled(Boolean auto_lock_enabled) {
        this.auto_lock_enabled = auto_lock_enabled;
    }

    public Boolean getBeeper_enabled() {
        return beeper_enabled;
    }

    public void setBeeper_enabled(Boolean beeper_enabled) {
        this.beeper_enabled = beeper_enabled;
    }

    public Boolean getVacation_mode() {
        return vacation_mode;
    }

    public void setVacation_mode(Boolean vacation_mode) {
        this.vacation_mode = vacation_mode;
    }

    public Integer getKey_code_length() {
        return key_code_length;
    }

    public void setKey_code_length(Integer key_code_length) {
        this.key_code_length = key_code_length;
    }

    public Boolean getAlarm_activated() {
        return alarm_activated;
    }

    public void setAlarm_activated(Boolean alarm_activated) {
        this.alarm_activated = alarm_activated;
    }
}
