package org.sleeper.draft;

import java.util.ArrayList;

public class Draft {
    ArrayList<Pick> picks;
    int numMembers;
    int numRounds;

    public Draft(int numMembers, int numRounds) {
        this.numMembers = numMembers;
        this.numRounds = numRounds;
    }

    public ArrayList<Pick> getPicks() {
        return picks;
    }

    public ArrayList<Pick> getRound(int round) {
        ArrayList<Pick> roundPicks = new ArrayList<Pick>();

        int firstPickOfRound = ((round - 1) * 10);
        int lastPickOfRound = firstPickOfRound + 9;

        for (int i = firstPickOfRound; i <= lastPickOfRound; ++i)
            roundPicks.add(picks.get(i));

        return roundPicks;
    }

//    public static Draft getDraftFromJson() {
//        return
//    }

}
