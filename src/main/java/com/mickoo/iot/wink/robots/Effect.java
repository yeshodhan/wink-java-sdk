package com.mickoo.iot.wink.robots;

import com.mickoo.iot.wink.WinkObject;
import com.mickoo.iot.wink.scenes.Scene;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Effect extends WinkObject {

    private Scene scene;
    private String recipient_actor_id;
    private String recipient_actor_type;
    private String notification_type;
    private String note;

    public Effect() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public String getRecipient_actor_id() {
        return recipient_actor_id;
    }

    public void setRecipient_actor_id(String recipient_actor_id) {
        this.recipient_actor_id = recipient_actor_id;
    }

    public String getRecipient_actor_type() {
        return recipient_actor_type;
    }

    public void setRecipient_actor_type(String recipient_actor_type) {
        this.recipient_actor_type = recipient_actor_type;
    }

    public String getNotification_type() {
        return notification_type;
    }

    public void setNotification_type(String notification_type) {
        this.notification_type = notification_type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
