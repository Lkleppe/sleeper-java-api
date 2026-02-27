package org.sleeper.avatar;

import org.sleeper.HttpInteraction;

public class AvatarRESTInteraction {

    // use javax.imageio package for loading images
    public static String getFullAvatarJson(String avatarID) {
        return HttpInteraction.getHttpResponse(getFullAvatarURL(avatarID));
    }

    public static String getThumbnailAvatarJson(String avatarID) {
        return HttpInteraction.getHttpResponse(getThumbnailAvatarURL(avatarID));
    }

    private static String getFullAvatarURL(String avatarID) {
        return String.format("https://sleepercdn.com/avatars/%s", avatarID);
    }

    private static String getThumbnailAvatarURL(String avatarID) {
        return String.format("https://sleepercdn.com/avatars/thumbs/%s", avatarID);
    }
}
