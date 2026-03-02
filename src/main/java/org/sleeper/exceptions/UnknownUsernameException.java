package org.sleeper.exceptions;

public class UnknownUsernameException extends Exception {

    public UnknownUsernameException(String username) {
        super(String.format("There is no user associated with the username %s.", username));
    }
}
