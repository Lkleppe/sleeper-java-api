package org.sleeper.players;

import java.util.Map;

public class Player {
    private static Map<String, Player> players = PlayerJsonParser.getPlayerMap(false);

    private String playerName;
    private String playerID;

    public Player(String playerName, String playerID) {
        this.playerName = playerName;
        this.playerID = playerID;
    }

//    public Player getPlayer
//
    public static Player getPlayer(String name) {
        return players.get(name);
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String toString() { return playerID + ": " + playerName; }

    public static void main(String[] args) {
        System.out.println(players);
    }
}
