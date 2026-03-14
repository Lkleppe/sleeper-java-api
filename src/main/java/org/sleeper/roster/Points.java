package org.sleeper.roster;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Points {
    private final double fptsAgainst;
    private final double fpts;
    private final double ppts;

    Points(int fpts, int fptsAgainst, int fptsDecimal, int fptsAgainstDecimal, int ppts, int pptsDecimal) {
        this.fpts = Math.round(fpts * 100.0 + fptsDecimal) / 100.0;
        this.fptsAgainst = Math.round(fptsAgainst * 100.0 + fptsAgainstDecimal) / 100.0;
        this.ppts = Math.round(ppts * 100.0 + pptsDecimal) / 100.0;
    }

    public String toString() {
        return String.format("Points(%.2f FOR, %.2f AGAINST)", fpts, fptsAgainst);
    }

    public static Points getPointsFromSettingsJson(JsonElement settings) {
        JsonObject asObject = settings.getAsJsonObject();

        return new Points(
                asObject.get("fpts").getAsInt(),
                asObject.get("fpts_against").getAsInt(),
                asObject.get("fpts_decimal").getAsInt(),
                asObject.get("fpts_against_decimal").getAsInt(),
                asObject.get("ppts").getAsInt(),
                asObject.get("ppts_decimal").getAsInt()
        );
    }

    public double getFptsAgainst() { return fptsAgainst; }
    public double getFpts() { return fpts; }
    public double getPpts() { return ppts; }

    public static void main(String[] args) {
//        System.out.println(new Points(1760, 1598, 44, 44));
    }
}
