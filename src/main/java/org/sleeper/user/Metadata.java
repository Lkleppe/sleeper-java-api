package org.sleeper.user;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Metadata {
    private final Boolean allowPushNotifcation;
    private final Boolean mentionPushNotification;
    private final String avatarURL;

    Metadata(Boolean allowPushNotifcation, Boolean mentionPushNotification, String avatarURL) {
        this.allowPushNotifcation = allowPushNotifcation;
        this.mentionPushNotification = mentionPushNotification;
        this.avatarURL = avatarURL;
    }

    public Boolean getAllowPushNotification() { return allowPushNotifcation; }
    public Boolean getMentionPushNotification() { return mentionPushNotification; }
    public String getAvatarURL() { return avatarURL; }

    static Metadata getMetadataFromJson(JsonElement json) {
        JsonObject asObject = json.getAsJsonObject();

        JsonElement allowPushNotification = asObject.get("allow_pn");
        JsonElement mentionPushNotification = asObject.get("mention_pn");
        JsonElement avatarURL = asObject.get("avatar");

        return new Metadata(
                allowPushNotification != null && !allowPushNotification.isJsonNull() ? allowPushNotification.getAsString().equalsIgnoreCase("on") : null,
                mentionPushNotification != null && !mentionPushNotification.isJsonNull() ? mentionPushNotification.getAsString().equalsIgnoreCase("on") : null,
                avatarURL != null && !avatarURL.isJsonNull() ? avatarURL.getAsString() : null
        );
    }
}
