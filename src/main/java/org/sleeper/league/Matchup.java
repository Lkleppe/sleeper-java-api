package org.sleeper.league;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.sleeper.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Matchup {
    private final String matchupID;
    private final TeamInMatchup team1;
    private final TeamInMatchup team2;

    Matchup(String matchupID, TeamInMatchup team1, TeamInMatchup team2) {
        this.matchupID = matchupID;
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getMatchupID() { return matchupID; }
    public TeamInMatchup getTeam1() { return team1; }
    public TeamInMatchup getTeam2() { return team2; }

    public static List<Matchup> getMatchupsFromJson(JsonElement json) {
        List<Matchup> result = new ArrayList<>();
        JsonArray asArray = json.getAsJsonArray();

        for (int i = 0; i < asArray.size(); ++i) {
            JsonObject team1 = asArray.get(i).getAsJsonObject();
            for (int j = i+1; j < asArray.size(); ++j) {
                JsonObject team2 = asArray.get(j).getAsJsonObject();
                if (team1.get("matchup_id").getAsInt() == team2.get("matchup_id").getAsInt())
                    result.add( new Matchup(
                            team1.get("matchup_id").getAsString(),
                            TeamInMatchup.getTeamFromJson(team1),
                            TeamInMatchup.getTeamFromJson(team2)
                            )
                    );
            }
        }
        return result;
    }

    public String toString() {
        return String.format("Matchup{%s vs. %s}", team1, team2);
    }
}
