package org.sleeper.draft;

import org.sleeper.players.Player;

public class Pick {
    private Player player;
    private int draftPick;

    public Pick(Player player, int draftPick) {
        this.player = player;
        this.draftPick = draftPick;
    }

    public int getDraftPick() {
        return draftPick;
    }

    public Player getPlayer() {
        return player;
    }

    public RoundPick calculateRoundAndPick(int numMembers) {
        return new RoundPick(draftPick / numMembers + 1, draftPick % numMembers);
    }
}
