package org.sleeper.draft;

public class RoundPick {
    private int round;
    private int pick;

    public RoundPick(int round, int pick) {
        this.round = round;
        this.pick = pick;
    }

    public String toString() {
        return "Round " + round + " Pick " + pick;
    }
}
