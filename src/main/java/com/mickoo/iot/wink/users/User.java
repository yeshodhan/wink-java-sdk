package com.mickoo.iot.wink.users;

import com.mickoo.iot.wink.WinkObject;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class User extends WinkObject {

    private String email;
    private String first_name;
    private String last_name;
    private OAuth2 oauth2;
    private String locale;
    private Boolean tos_accepted;
    private Boolean confirmed;

    private Object units;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public OAuth2 getOauth2() {
        return oauth2;
    }

    public void setOauth2(OAuth2 oauth2) {
        this.oauth2 = oauth2;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getTos_accepted() {
        return tos_accepted;
    }

    public void setTos_accepted(Boolean tos_accepted) {
        this.tos_accepted = tos_accepted;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Object getUnits() {
        return units;
    }

    public void setUnits(Object units) {
        this.units = units;
    }
}
