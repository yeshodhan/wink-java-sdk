package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Nimbus extends WinkDevice {

    private List<Dial> dials;
    private List<NimbusAlarm> alarms;

    public Nimbus() {
    }

    public List<Dial> getDials() {
        return dials;
    }

    public void setDials(List<Dial> dials) {
        this.dials = dials;
    }

    public List<NimbusAlarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<NimbusAlarm> alarms) {
        this.alarms = alarms;
    }

    public static class Dial {
        public String dial_id;
        public Integer dial_index;
        public String label;
        public List<String> labels;
        public String dial_template_id;
        public DialConfiguration dial_configuration;
        public ChannelConfiguration channel_configuration;
        public String name;
        public Double position;
        public Integer brightness;

        public Dial() {
        }
    }

    public static class DialConfiguration {
        public Integer min_value, max_value, min_position, max_position;
        public String scale_type, rotation;

        public DialConfiguration() {
        }
    }

    public static class ChannelConfiguration {
        public String channel_id, reading_type, locale, timezone, location, start_location, stop_location, transit_mode;
        public List<String> linked_service_ids, linked_service_types;
        public List<Double> lat_lng, start_lat_lng, stop_lat_lng;

        public ChannelConfiguration() {
        }
    }

}
