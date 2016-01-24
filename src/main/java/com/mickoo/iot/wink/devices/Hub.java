package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Hub extends WinkDevice {

    private HubDesiredState desired_state;
    private HubLastReading last_reading;

    public Hub() {
    }

    public HubDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(HubDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public HubLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(HubLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class HubDesiredState extends DesiredState {
        private PairingMode pairing_mode;
        private Integer kidde_radio_code;

        public HubDesiredState() {
        }

        public PairingMode getPairing_mode() {
            return pairing_mode;
        }

        public void setPairing_mode(PairingMode pairing_mode) {
            this.pairing_mode = pairing_mode;
        }

        public Integer getKidde_radio_code() {
            return kidde_radio_code;
        }

        public void setKidde_radio_code(Integer kidde_radio_code) {
            this.kidde_radio_code = kidde_radio_code;
        }
    }

    public static class HubLastReading extends LastReading {
        private Boolean connection;
        private Boolean remote_pairable;
        private Boolean updating_firmware;
        private String firmware_version;
        private String mac_address;
        private String ip_address;
        private Boolean update_needed;

        public HubLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }

        public Boolean getRemote_pairable() {
            return remote_pairable;
        }

        public void setRemote_pairable(Boolean remote_pairable) {
            this.remote_pairable = remote_pairable;
        }

        public Boolean getUpdating_firmware() {
            return updating_firmware;
        }

        public void setUpdating_firmware(Boolean updating_firmware) {
            this.updating_firmware = updating_firmware;
        }

        public String getFirmware_version() {
            return firmware_version;
        }

        public void setFirmware_version(String firmware_version) {
            this.firmware_version = firmware_version;
        }

        public String getMac_address() {
            return mac_address;
        }

        public void setMac_address(String mac_address) {
            this.mac_address = mac_address;
        }

        public String getIp_address() {
            return ip_address;
        }

        public void setIp_address(String ip_address) {
            this.ip_address = ip_address;
        }

        public Boolean getUpdate_needed() {
            return update_needed;
        }

        public void setUpdate_needed(Boolean update_needed) {
            this.update_needed = update_needed;
        }
    }

    public enum PairingMode {
        zigbee, zwave, lutron, zwave_exclusion
    }
}
