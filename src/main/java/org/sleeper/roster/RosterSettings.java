package org.sleeper.roster;

public class RosterSettings {
    private int waiverPosition;
    private int waiverBudgetUsed;
    private int totalMoves;

    RosterSettings(int waiverPosition, int waiverBudgetUsed, int totalMoves) {
        this.waiverPosition = waiverPosition;
        this.waiverBudgetUsed = waiverBudgetUsed;
        this.totalMoves = totalMoves;
    }

    public String toString() {
        return String.format("Settings(%d waiverPosition, %d waiverBudgetUsed, %d totalMoves",
                waiverPosition, waiverBudgetUsed, totalMoves);
    }

    public int getWaiverPosition() { return waiverPosition; }
    public int getWaiverBudgetUsed() { return waiverBudgetUsed; }
    public int getTotalMoves() { return totalMoves; }
}
