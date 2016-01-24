package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class LightBulb extends WinkDevice {

    private LightBulbDesiredState desired_state;
    private LightBulbLastReading last_reading;

    public LightBulb() {
    }

    public LightBulbDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(LightBulbDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public LightBulbLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(LightBulbLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class LightBulbDesiredState extends DesiredState {
        private Boolean powered;
        private Double brightness; //0.0 to 1.0, dimness level (binary_switch and light_bulb)
        private ColorModel color_model; //one of: "xy", "hsb", "color_temperature", or "rgb"
        private Double color_x; //the CIE 1931 coordinates of the bulb's color [0.0, 1.0]
        private Double color_y; //the CIE 1931 coordinates of the bulb's color [0.0, 1.0]
        private Double hue; //the 360-degree value of the bulb's color (normalized to 1.0)
        private Double saturation; //the percentage value of the bulb's saturation (normalized to 1.0) [0.0, 1.0]
        private Integer color_temperature; //the Kelvin value of the bulb's color [2000 .. 6500]
        private String color; //the hexadecimal value of the bulb color (without a leading '#')
        private PoweringMode powering_mode; // one of "dumb", "smart", "none" or null

        public LightBulbDesiredState() {
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }

        public Double getBrightness() {
            return brightness;
        }

        public void setBrightness(Double brightness) {
            this.brightness = brightness;
        }

        public ColorModel getColor_model() {
            return color_model;
        }

        public void setColor_model(ColorModel color_model) {
            this.color_model = color_model;
        }

        public Double getColor_x() {
            return color_x;
        }

        public void setColor_x(Double color_x) {
            this.color_x = color_x;
        }

        public Double getColor_y() {
            return color_y;
        }

        public void setColor_y(Double color_y) {
            this.color_y = color_y;
        }

        public Double getHue() {
            return hue;
        }

        public void setHue(Double hue) {
            this.hue = hue;
        }

        public Double getSaturation() {
            return saturation;
        }

        public void setSaturation(Double saturation) {
            this.saturation = saturation;
        }

        public Integer getColor_temperature() {
            return color_temperature;
        }

        public void setColor_temperature(Integer color_temperature) {
            this.color_temperature = color_temperature;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public PoweringMode getPowering_mode() {
            return powering_mode;
        }

        public void setPowering_mode(PoweringMode powering_mode) {
            this.powering_mode = powering_mode;
        }
    }

    public static class LightBulbLastReading {
        private Boolean connection;

        public LightBulbLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }
    }

    public enum PoweringMode {
        dumb, smart, none
    }

    public enum ColorModel {
        xy, hsb, color_temperature, rgb
    }
}
