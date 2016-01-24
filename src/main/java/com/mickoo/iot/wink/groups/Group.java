package com.mickoo.iot.wink.groups;

import com.mickoo.iot.wink.WinkObject;
import com.mickoo.iot.wink.devices.DesiredState;
import com.mickoo.iot.wink.members.Member;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Group extends WinkObject {

    private String name;
    private List<Member> members;
    private String automation_mode; //system_category or user_category, also indicated by a prefix of . or @
    private ReadingAggregation reading_aggregation;
    private DesiredState desired_state;

    public Group() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getAutomation_mode() {
        return automation_mode;
    }

    public void setAutomation_mode(String automation_mode) {
        this.automation_mode = automation_mode;
    }

    public ReadingAggregation getReading_aggregation() {
        return reading_aggregation;
    }

    public void setReading_aggregation(ReadingAggregation reading_aggregation) {
        this.reading_aggregation = reading_aggregation;
    }

    public DesiredState getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(DesiredState desired_state) {
        this.desired_state = desired_state;
    }

    public static class ReadingAggregation {
        private Long updated_at;

        //Boolean Aggregation
        private Boolean or;
        private Boolean and;
        private Integer true_count;
        private Integer false_count;

        //Numeric Aggregation
        private Double min;
        private Double max;
        private Double average;

        public ReadingAggregation() {
        }

        public Long getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(Long updated_at) {
            this.updated_at = updated_at;
        }

        public Boolean getOr() {
            return or;
        }

        public void setOr(Boolean or) {
            this.or = or;
        }

        public Boolean getAnd() {
            return and;
        }

        public void setAnd(Boolean and) {
            this.and = and;
        }

        public Integer getTrue_count() {
            return true_count;
        }

        public void setTrue_count(Integer true_count) {
            this.true_count = true_count;
        }

        public Integer getFalse_count() {
            return false_count;
        }

        public void setFalse_count(Integer false_count) {
            this.false_count = false_count;
        }

        public Double getMin() {
            return min;
        }

        public void setMin(Double min) {
            this.min = min;
        }

        public Double getMax() {
            return max;
        }

        public void setMax(Double max) {
            this.max = max;
        }

        public Double getAverage() {
            return average;
        }

        public void setAverage(Double average) {
            this.average = average;
        }
    }

}
