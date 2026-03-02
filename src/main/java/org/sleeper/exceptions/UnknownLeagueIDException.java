package org.sleeper.exceptions;

public class UnknownLeagueIDException extends RuntimeException {

    public UnknownLeagueIDException(String leagueID) {
        super(String.format("The league ID %s does not exist.", leagueID));
    }
}
