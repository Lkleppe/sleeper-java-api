package org.sleeper.players;

import org.sleeper.HttpInteraction;

public class PlayerRESTInteraction {

    public static String getAllPlayersJson() {
        return HttpInteraction.getHttpResponse(getAllPlayersURL());
    }

    private static String getAllPlayersURL() {
        return "https://api.sleeper.app/v1/players/nfl";
    }

    public static void main(String[] args) {
        System.out.println(getAllPlayersJson());
    }
}
