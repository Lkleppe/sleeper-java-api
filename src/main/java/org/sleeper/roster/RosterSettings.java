package org.sleeper.roster;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

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
        return String.format("Settings(%d waiverPosition, %d waiverBudgetUsed, %d totalMoves)",
                waiverPosition, waiverBudgetUsed, totalMoves);
    }

    public static RosterSettings getSettingsFromJson(JsonElement json) {
        JsonObject asObject = json.getAsJsonObject();

        return new RosterSettings(
                asObject.get("waiver_position").getAsInt(),
                asObject.get("waiver_budget_used").getAsInt(),
                asObject.get("total_moves").getAsInt()
        );
    }

    public int getWaiverPosition() { return waiverPosition; }
    public int getWaiverBudgetUsed() { return waiverBudgetUsed; }
    public int getTotalMoves() { return totalMoves; }
}
