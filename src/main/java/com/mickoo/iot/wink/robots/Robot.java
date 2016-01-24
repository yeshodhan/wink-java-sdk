package com.mickoo.iot.wink.robots;

import com.mickoo.iot.wink.WinkObject;
import com.mickoo.iot.wink.devices.DesiredState;
import com.mickoo.iot.wink.devices.LastReading;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Robot extends WinkObject {

    private String robot_id;
    private String name;
    private String creating_actor_type;
    private String creating_actor_id;
    private String automation_mode; //mode of robot if generated for smart features, current possible values -- null (not smart), "smart_schedule", "smart_away_arriving", "smart_away_departing"; client writable values "notification" (fridge note), "tapt" (created implicitly through relay or tapt interface)
    private List<Condition> causes;
    private List<Condition> restrictions;
    private List<Effect> effects;
    private RobotDesiredState desired_state;
    private RobotLastReading last_reading;

    public Robot() {
    }

    public String getRobot_id() {
        return robot_id;
    }

    public void setRobot_id(String robot_id) {
        this.robot_id = robot_id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCreating_actor_type() {
        return creating_actor_type;
    }

    public void setCreating_actor_type(String creating_actor_type) {
        this.creating_actor_type = creating_actor_type;
    }

    public String getCreating_actor_id() {
        return creating_actor_id;
    }

    public void setCreating_actor_id(String creating_actor_id) {
        this.creating_actor_id = creating_actor_id;
    }

    public String getAutomation_mode() {
        return automation_mode;
    }

    public void setAutomation_mode(String automation_mode) {
        this.automation_mode = automation_mode;
    }

    public List<Condition> getCauses() {
        return causes;
    }

    public void setCauses(List<Condition> causes) {
        this.causes = causes;
    }

    public List<Condition> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Condition> restrictions) {
        this.restrictions = restrictions;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public RobotDesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(RobotDesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public RobotLastReading getLast_reading() {
        return last_reading;
    }

    public void setLast_reading(RobotLastReading last_reading) {
        this.last_reading = last_reading;
    }

    public static class RobotDesiredState extends DesiredState {
        private Boolean enabled;
        private Integer fired_limit;

        public RobotDesiredState() {
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getFired_limit() {
            return fired_limit;
        }

        public void setFired_limit(Integer fired_limit) {
            this.fired_limit = fired_limit;
        }
    }

    public static class RobotLastReading extends LastReading {
        private Boolean fired;

        public RobotLastReading() {
        }

        public Boolean getFired() {
            return fired;
        }

        public void setFired(Boolean fired) {
            this.fired = fired;
        }
    }
}
