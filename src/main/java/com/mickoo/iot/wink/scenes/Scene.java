package com.mickoo.iot.wink.scenes;

import com.mickoo.iot.wink.WinkObject;
import com.mickoo.iot.wink.members.Member;

import java.util.List;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Scene extends WinkObject {


    private List<Member> members;

    public Scene() {
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
