package org.sleeper.exceptions;

public class UnknownUserIDException extends Exception {

    public UnknownUserIDException(String userID) {
        super(String.format("There is no user associated with the ID %s.", userID));
    }
}
