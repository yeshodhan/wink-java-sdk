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

    private String sprinkler_id;
    private List<Zone> zones;
    private List<Integer> run_zones;
    private List<Integer> run_zones_durations;

    public Sprinkler() {
    }

    public String getSprinkler_id() {
        return sprinkler_id;
    }

    public void setSprinkler_id(String sprinkler_id) {
        this.sprinkler_id = sprinkler_id;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
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

    public static class Zone {
        
        private String zone_id;
        private Integer zone_index;
        private Boolean enabled;

        private Shade shade;
        private Nozzle nozzle;
        private Slope slope;
        private Soil soil;
        private Vegetation vegetation;

        private Boolean powered;

        public Zone() {
        }

        public String getZone_id() {
            return zone_id;
        }

        public void setZone_id(String zone_id) {
            this.zone_id = zone_id;
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

}
