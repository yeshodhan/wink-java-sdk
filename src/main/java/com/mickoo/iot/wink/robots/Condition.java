package com.mickoo.iot.wink.robots;

import com.mickoo.iot.wink.WinkObject;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Condition extends WinkObject {

    private String condition_id;
    private String observed_field;
    private String observed_object_id;
    private String observed_object_type;
    private String operator;
    private String value;
    private String recurrence;
    private String restriction_join;
    private Integer robot_id;
    private Integer restricted_object_id;
    private String restricted_object_type;
    private List<Condition> restrictions;

    public Condition() {
    }

    public String getCondition_id() {
        return condition_id;
    }

    public void setCondition_id(String condition_id) {
        this.condition_id = condition_id;
    }

    public String getObserved_field() {
        return observed_field;
    }

    public void setObserved_field(String observed_field) {
        this.observed_field = observed_field;
    }

    public String getObserved_object_id() {
        return observed_object_id;
    }

    public void setObserved_object_id(String observed_object_id) {
        this.observed_object_id = observed_object_id;
    }

    public String getObserved_object_type() {
        return observed_object_type;
    }

    public void setObserved_object_type(String observed_object_type) {
        this.observed_object_type = observed_object_type;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public String getRestriction_join() {
        return restriction_join;
    }

    public void setRestriction_join(String restriction_join) {
        this.restriction_join = restriction_join;
    }

    public Integer getRobot_id() {
        return robot_id;
    }

    public void setRobot_id(Integer robot_id) {
        this.robot_id = robot_id;
    }

    public Integer getRestricted_object_id() {
        return restricted_object_id;
    }

    public void setRestricted_object_id(Integer restricted_object_id) {
        this.restricted_object_id = restricted_object_id;
    }

    public String getRestricted_object_type() {
        return restricted_object_type;
    }

    public void setRestricted_object_type(String restricted_object_type) {
        this.restricted_object_type = restricted_object_type;
    }

    public List<Condition> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Condition> restrictions) {
        this.restrictions = restrictions;
    }
}
