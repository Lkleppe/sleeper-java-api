package org.sleeper.exceptions;

public class UnknownPlayerIDException extends RuntimeException{

    public UnknownPlayerIDException(String playerID) {
        super(String.format("There is no player associated with the ID %s.", playerID));
    }
}
