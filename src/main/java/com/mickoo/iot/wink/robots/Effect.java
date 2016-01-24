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
    private CustomText note;

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

    public CustomText getNote() {
        return note;
    }

    public void setNote(CustomText note) {
        this.note = note;
    }

    public static class CustomText {
        private String custom_text_id;
        private String body;
        private String subject_id;
        private String subject_type;

        public CustomText() {
        }

        public String getCustom_text_id() {
            return custom_text_id;
        }

        public void setCustom_text_id(String custom_text_id) {
            this.custom_text_id = custom_text_id;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getSubject_type() {
            return subject_type;
        }

        public void setSubject_type(String subject_type) {
            this.subject_type = subject_type;
        }
    }
}
