package com.mickoo.iot.wink.devices;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Sprinkler extends WinkDevice {

    private List<Zone> zones;
    private SprinklerDesiredState desired_state;

    public Sprinkler() {
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public SprinklerDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(SprinklerDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public static class SprinklerDesiredState extends DesiredState {
        private List<Integer> run_zones;
        private List<Integer> run_zones_durations;

        public SprinklerDesiredState() {
        }

        public List<Integer> getRun_zones() {
            return run_zones;
        }

        public void setRun_zones(List<Integer> run_zones) {
            this.run_zones = run_zones;
        }

        public List<Integer> getRun_zones_durations() {
            return run_zones_durations;
        }

        public void setRun_zones_durations(List<Integer> run_zones_durations) {
            this.run_zones_durations = run_zones_durations;
        }
    }

    public static class Zone extends WinkDevice {

        private Integer zone_index;
        private Boolean enabled;
        private ZoneDesiredState desired_state;
        private ZoneLastReading last_reading;

        public Zone() {
        }

        public Integer getZone_index() {
            return zone_index;
        }

        public void setZone_index(Integer zone_index) {
            this.zone_index = zone_index;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public ZoneDesiredState getDesired_state() {
            return desired_state;
        }

        public void setDesired_state(ZoneDesiredState desired_state) {
            this.desired_state = desired_state;
        }

        public ZoneLastReading getLast_reading() {
            return last_reading;
        }

        public void setLast_reading(ZoneLastReading last_reading) {
            this.last_reading = last_reading;
        }
    }

    public static class ZoneDesiredState extends DesiredState {
        private Shade shade;
        private Nozzle nozzle;
        private Slope slope;
        private Soil soil;
        private Vegetation vegetation;

        public ZoneDesiredState() {
        }

        public Shade getShade() {
            return shade;
        }

        public void setShade(Shade shade) {
            this.shade = shade;
        }

        public Nozzle getNozzle() {
            return nozzle;
        }

        public void setNozzle(Nozzle nozzle) {
            this.nozzle = nozzle;
        }

        public Slope getSlope() {
            return slope;
        }

        public void setSlope(Slope slope) {
            this.slope = slope;
        }

        public Soil getSoil() {
            return soil;
        }

        public void setSoil(Soil soil) {
            this.soil = soil;
        }

        public Vegetation getVegetation() {
            return vegetation;
        }

        public void setVegetation(Vegetation vegetation) {
            this.vegetation = vegetation;
        }
    }

    public static class ZoneLastReading extends LastReading {
        private Boolean powered;

        public ZoneLastReading() {
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }
    }

    public enum Shade {
        none, moderate, mostly
    }

    public enum Nozzle {
        fixed_spray_head, drip, manual_sprinkler, rotary_head, rotor_head
    }
    public enum Slope {
        bottom, flat, slope, top
    }
    public enum Soil {
        clay, sand, silt, top_soil
    }
    public enum Vegetation {
        annuals,garden, grass,perennials, shrubs, trees, xeric, xeriscape
    }

}
