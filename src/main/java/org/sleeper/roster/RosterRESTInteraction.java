package org.sleeper.roster;

import org.sleeper.HttpInteraction;

public class RosterRESTInteraction {

    public static String getLeagueRostersFromREST(String leagueID) {
        return HttpInteraction.getHttpResponse(getLeagueRostersURL(leagueID));
    }

    private static String getLeagueRostersURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/rosters", leagueID);
    }
}
