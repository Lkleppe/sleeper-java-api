package org.sleeper.exceptions;

public class UnknownAvatarIDException extends RuntimeException {

    public UnknownAvatarIDException(String avatarID) {
        super(String.format("There is no avatar associated with the ID %s.", avatarID));
    }
}
