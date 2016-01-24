package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Thermostat extends WinkDevice {

    private ThermostateDesiredState desired_state;
    private ThermostatLastReading last_reading;

    public Thermostat() {
    }

    public ThermostateDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(ThermostateDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public ThermostatLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(ThermostatLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class ThermostateDesiredState extends DesiredState {
        private Mode mode; //One of ["cool_only", "heat_only", "auto", "aux"], allowed value depends in mode.choices in capabilities
        private Boolean powered;
        private Double max_set_point;
        private Double min_set_point;
        private Double override_temperature;
        private Integer setpoint_increment_value;
        private Boolean accelerometer_enable;
        private Boolean temperature_override_enable;
        private Integer fan_duration;
        private Boolean users_away;
        private CoolingSystemStage cooling_system_stage; //one of "cool_stage_1", "cool_stage_2"
        private HeatingSystemStage heating_system_stage; //one of "heat_stage_1", "heat_stage_2"
        private HeatingSystemType heating_system_type; //one of "conventional", "heat_pump"
        private HeatingFuelSource heating_fuel_source; //one of "electric", "gas"
        private HumidifierMode humidifier_mode; //one of "on", "off", "auto"
        private Double humidifier_set_point;
        private FanMode fan_mode; //on of one of "[on,auto]", auto will turn the fan on when heating or cooling is active
        private DehumidifierMode dehumidifier_mode; // one of “[on,off]”
        private Double dehumidifier_set_point;
        private Double dehumidify_overcool_offset;
        private Profile profile; //one of “[home,away,sleep,awake,null]” depends on capabilities]

        public ThermostateDesiredState() {
        }

        public Mode getMode() {
            return mode;
        }

        public void setMode(Mode mode) {
            this.mode = mode;
        }

        public Boolean getPowered() {
            return powered;
        }

        public void setPowered(Boolean powered) {
            this.powered = powered;
        }

        public Double getMax_set_point() {
            return max_set_point;
        }

        public void setMax_set_point(Double max_set_point) {
            this.max_set_point = max_set_point;
        }

        public Double getMin_set_point() {
            return min_set_point;
        }

        public void setMin_set_point(Double min_set_point) {
            this.min_set_point = min_set_point;
        }

        public Double getOverride_temperature() {
            return override_temperature;
        }

        public void setOverride_temperature(Double override_temperature) {
            this.override_temperature = override_temperature;
        }

        public Integer getSetpoint_increment_value() {
            return setpoint_increment_value;
        }

        public void setSetpoint_increment_value(Integer setpoint_increment_value) {
            this.setpoint_increment_value = setpoint_increment_value;
        }

        public Boolean getAccelerometer_enable() {
            return accelerometer_enable;
        }

        public void setAccelerometer_enable(Boolean accelerometer_enable) {
            this.accelerometer_enable = accelerometer_enable;
        }

        public Boolean getTemperature_override_enable() {
            return temperature_override_enable;
        }

        public void setTemperature_override_enable(Boolean temperature_override_enable) {
            this.temperature_override_enable = temperature_override_enable;
        }

        public Integer getFan_duration() {
            return fan_duration;
        }

        public void setFan_duration(Integer fan_duration) {
            this.fan_duration = fan_duration;
        }

        public Boolean getUsers_away() {
            return users_away;
        }

        public void setUsers_away(Boolean users_away) {
            this.users_away = users_away;
        }

        public CoolingSystemStage getCooling_system_stage() {
            return cooling_system_stage;
        }

        public void setCooling_system_stage(CoolingSystemStage cooling_system_stage) {
            this.cooling_system_stage = cooling_system_stage;
        }

        public HeatingSystemStage getHeating_system_stage() {
            return heating_system_stage;
        }

        public void setHeating_system_stage(HeatingSystemStage heating_system_stage) {
            this.heating_system_stage = heating_system_stage;
        }

        public HeatingSystemType getHeating_system_type() {
            return heating_system_type;
        }

        public void setHeating_system_type(HeatingSystemType heating_system_type) {
            this.heating_system_type = heating_system_type;
        }

        public HeatingFuelSource getHeating_fuel_source() {
            return heating_fuel_source;
        }

        public void setHeating_fuel_source(HeatingFuelSource heating_fuel_source) {
            this.heating_fuel_source = heating_fuel_source;
        }

        public HumidifierMode getHumidifier_mode() {
            return humidifier_mode;
        }

        public void setHumidifier_mode(HumidifierMode humidifier_mode) {
            this.humidifier_mode = humidifier_mode;
        }

        public Double getHumidifier_set_point() {
            return humidifier_set_point;
        }

        public void setHumidifier_set_point(Double humidifier_set_point) {
            this.humidifier_set_point = humidifier_set_point;
        }

        public FanMode getFan_mode() {
            return fan_mode;
        }

        public void setFan_mode(FanMode fan_mode) {
            this.fan_mode = fan_mode;
        }

        public DehumidifierMode getDehumidifier_mode() {
            return dehumidifier_mode;
        }

        public void setDehumidifier_mode(DehumidifierMode dehumidifier_mode) {
            this.dehumidifier_mode = dehumidifier_mode;
        }

        public Double getDehumidifier_set_point() {
            return dehumidifier_set_point;
        }

        public void setDehumidifier_set_point(Double dehumidifier_set_point) {
            this.dehumidifier_set_point = dehumidifier_set_point;
        }

        public Double getDehumidify_overcool_offset() {
            return dehumidify_overcool_offset;
        }

        public void setDehumidify_overcool_offset(Double dehumidify_overcool_offset) {
            this.dehumidify_overcool_offset = dehumidify_overcool_offset;
        }

        public Profile getProfile() {
            return profile;
        }

        public void setProfile(Profile profile) {
            this.profile = profile;
        }
    }

    public static class ThermostatLastReading extends LastReading {
        private Boolean connection;
        private Double temperature;
        private Double smart_temperature;
        private Double humidity;
        private Double external_temperature;
        private Double max_max_set_point;
        private Double min_max_set_point;
        private Double max_min_set_point;
        private Double min_min_set_point;
        private Boolean has_fan;
        private Boolean fan_timer_active;
        private Boolean eco_target;
        private String override_temperature_group_id;
        private Double deadband;
        private String technician_name;
        private String technician_phone;
        private Boolean aux_active;
        private Boolean cool_active;
        private Boolean heat_active;
        private Boolean fan_active;
        private String last_error;
        private Boolean occupied;

        public ThermostatLastReading() {
        }

        public Boolean getConnection() {
            return connection;
        }

        public void setConnection(Boolean connection) {
            this.connection = connection;
        }

        public Double getTemperature() {
            return temperature;
        }

        public void setTemperature(Double temperature) {
            this.temperature = temperature;
        }

        public Double getSmart_temperature() {
            return smart_temperature;
        }

        public void setSmart_temperature(Double smart_temperature) {
            this.smart_temperature = smart_temperature;
        }

        public Double getHumidity() {
            return humidity;
        }

        public void setHumidity(Double humidity) {
            this.humidity = humidity;
        }

        public Double getExternal_temperature() {
            return external_temperature;
        }

        public void setExternal_temperature(Double external_temperature) {
            this.external_temperature = external_temperature;
        }

        public Double getMax_max_set_point() {
            return max_max_set_point;
        }

        public void setMax_max_set_point(Double max_max_set_point) {
            this.max_max_set_point = max_max_set_point;
        }

        public Double getMin_max_set_point() {
            return min_max_set_point;
        }

        public void setMin_max_set_point(Double min_max_set_point) {
            this.min_max_set_point = min_max_set_point;
        }

        public Double getMax_min_set_point() {
            return max_min_set_point;
        }

        public void setMax_min_set_point(Double max_min_set_point) {
            this.max_min_set_point = max_min_set_point;
        }

        public Double getMin_min_set_point() {
            return min_min_set_point;
        }

        public void setMin_min_set_point(Double min_min_set_point) {
            this.min_min_set_point = min_min_set_point;
        }

        public Boolean getHas_fan() {
            return has_fan;
        }

        public void setHas_fan(Boolean has_fan) {
            this.has_fan = has_fan;
        }

        public Boolean getFan_timer_active() {
            return fan_timer_active;
        }

        public void setFan_timer_active(Boolean fan_timer_active) {
            this.fan_timer_active = fan_timer_active;
        }

        public Boolean getEco_target() {
            return eco_target;
        }

        public void setEco_target(Boolean eco_target) {
            this.eco_target = eco_target;
        }

        public String getOverride_temperature_group_id() {
            return override_temperature_group_id;
        }

        public void setOverride_temperature_group_id(String override_temperature_group_id) {
            this.override_temperature_group_id = override_temperature_group_id;
        }

        public Double getDeadband() {
            return deadband;
        }

        public void setDeadband(Double deadband) {
            this.deadband = deadband;
        }

        public String getTechnician_name() {
            return technician_name;
        }

        public void setTechnician_name(String technician_name) {
            this.technician_name = technician_name;
        }

        public String getTechnician_phone() {
            return technician_phone;
        }

        public void setTechnician_phone(String technician_phone) {
            this.technician_phone = technician_phone;
        }

        public Boolean getAux_active() {
            return aux_active;
        }

        public void setAux_active(Boolean aux_active) {
            this.aux_active = aux_active;
        }

        public Boolean getCool_active() {
            return cool_active;
        }

        public void setCool_active(Boolean cool_active) {
            this.cool_active = cool_active;
        }

        public Boolean getHeat_active() {
            return heat_active;
        }

        public void setHeat_active(Boolean heat_active) {
            this.heat_active = heat_active;
        }

        public Boolean getFan_active() {
            return fan_active;
        }

        public void setFan_active(Boolean fan_active) {
            this.fan_active = fan_active;
        }

        public String getLast_error() {
            return last_error;
        }

        public void setLast_error(String last_error) {
            this.last_error = last_error;
        }

        public Boolean getOccupied() {
            return occupied;
        }

        public void setOccupied(Boolean occupied) {
            this.occupied = occupied;
        }
    }


    public enum Mode {
        cool_only, heat_only, auto, aux
    }

    public enum CoolingSystemStage {
        cool_stage_1, cool_stage_2
    }

    public enum HeatingSystemStage {
        heat_stage_1, heat_stage_2
    }

    public enum HeatingSystemType {
        conventional, heat_pump
    }

    public enum HeatingFuelSource {
        electric, gas
    }

    public enum HumidifierMode {
        on, off, auto
    }

    public enum FanMode {
        on, auto
    }

    public enum DehumidifierMode {
        on, off
    }

    public enum Profile {
        home, away, sleep, awake
    }


}
