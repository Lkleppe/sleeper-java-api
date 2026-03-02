package org.sleeper.league;

import com.google.gson.JsonElement;

import java.util.Map;

public class ScoringSettings {

    // Passing
    private final double passingYards;          // "pass_yd"
    private final double passingTouchdown;       // "pass_td"
    private final double passingInterception;    // "pass_int"
    private final double passing2PtConversion;   // "pass_2pt"

    // Rushing
    private final double rushingYards;           // "rush_yd"
    private final double rushingTouchdown;       // "rush_td"
    private final double rushing2PtConversion;   // "rush_2pt"

    // Receiving
    private final double reception;              // "rec"
    private final double receivingYards;         // "rec_yd"
    private final double receivingTouchdown;     // "rec_td"
    private final double receiving2PtConversion; // "rec_2pt"

    // Fumbles
    private final double fumble;                 // "fum"
    private final double fumbleLost;             // "fum_lost"
    private final double fumbleRecovery;         // "fum_rec"
    private final double fumbleRecoveryTouchdown;// "fum_rec_td"

    // Kicking - Extra Points
    private final double extraPointMade;         // "xpm"
    private final double extraPointMissed;       // "xpmiss"

    // Kicking - Field Goals Made (by distance)
    private final double fieldGoalMade0_19;      // "fgm_0_19"
    private final double fieldGoalMade20_29;     // "fgm_20_29"
    private final double fieldGoalMade30_39;     // "fgm_30_39"
    private final double fieldGoalMade40_49;     // "fgm_40_49"
    private final double fieldGoalMade50_59;     // "fgm_50_59"
    private final double fieldGoalMade60Plus;    // "fgm_60p"
    private final double fieldGoalMissed;        // "fgmiss"

    // Defense / Special Teams - Scoring
    private final double defensiveTouchdown;     // "def_td"
    private final double defensiveSpecialTeamsTouchdown; // "def_st_td"
    private final double specialTeamsTouchdown;  // "st_td"

    // Defense - Turnovers & Plays
    private final double sack;                   // "sack"
    private final double interception;           // "int"
    private final double forcedFumble;           // "ff"
    private final double defensiveForcedFumble;  // "def_st_ff" (ST forced fumble)
    private final double specialTeamsForcedFumble; // "st_ff"
    private final double defensiveFumbleRecovery;  // "def_st_fum_rec" (ST fumble rec)
    private final double specialTeamsFumbleRecovery; // "st_fum_rec"
    private final double blockedKick;            // "blk_kick"
    private final double safety;                 // "safe"

    // Defense - Points Allowed
    private final double pointsAllowed0;         // "pts_allow_0"
    private final double pointsAllowed1_6;       // "pts_allow_1_6"
    private final double pointsAllowed7_13;      // "pts_allow_7_13"
    private final double pointsAllowed14_20;     // "pts_allow_14_20"
    private final double pointsAllowed21_27;     // "pts_allow_21_27"
    private final double pointsAllowed28_34;     // "pts_allow_28_34"
    private final double pointsAllowed35Plus;    // "pts_allow_35p"


    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    public ScoringSettings(
            double passingYards,
            double passingTouchdown,
            double passingInterception,
            double passing2PtConversion,
            double rushingYards,
            double rushingTouchdown,
            double rushing2PtConversion,
            double reception,
            double receivingYards,
            double receivingTouchdown,
            double receiving2PtConversion,
            double fumble,
            double fumbleLost,
            double fumbleRecovery,
            double fumbleRecoveryTouchdown,
            double extraPointMade,
            double extraPointMissed,
            double fieldGoalMade0_19,
            double fieldGoalMade20_29,
            double fieldGoalMade30_39,
            double fieldGoalMade40_49,
            double fieldGoalMade50_59,
            double fieldGoalMade60Plus,
            double fieldGoalMissed,
            double defensiveTouchdown,
            double defensiveSpecialTeamsTouchdown,
            double specialTeamsTouchdown,
            double sack,
            double interception,
            double forcedFumble,
            double defensiveForcedFumble,
            double specialTeamsForcedFumble,
            double defensiveFumbleRecovery,
            double specialTeamsFumbleRecovery,
            double blockedKick,
            double safety,
            double pointsAllowed0,
            double pointsAllowed1_6,
            double pointsAllowed7_13,
            double pointsAllowed14_20,
            double pointsAllowed21_27,
            double pointsAllowed28_34,
            double pointsAllowed35Plus
    ) {
        this.passingYards = passingYards;
        this.passingTouchdown = passingTouchdown;
        this.passingInterception = passingInterception;
        this.passing2PtConversion = passing2PtConversion;
        this.rushingYards = rushingYards;
        this.rushingTouchdown = rushingTouchdown;
        this.rushing2PtConversion = rushing2PtConversion;
        this.reception = reception;
        this.receivingYards = receivingYards;
        this.receivingTouchdown = receivingTouchdown;
        this.receiving2PtConversion = receiving2PtConversion;
        this.fumble = fumble;
        this.fumbleLost = fumbleLost;
        this.fumbleRecovery = fumbleRecovery;
        this.fumbleRecoveryTouchdown = fumbleRecoveryTouchdown;
        this.extraPointMade = extraPointMade;
        this.extraPointMissed = extraPointMissed;
        this.fieldGoalMade0_19 = fieldGoalMade0_19;
        this.fieldGoalMade20_29 = fieldGoalMade20_29;
        this.fieldGoalMade30_39 = fieldGoalMade30_39;
        this.fieldGoalMade40_49 = fieldGoalMade40_49;
        this.fieldGoalMade50_59 = fieldGoalMade50_59;
        this.fieldGoalMade60Plus = fieldGoalMade60Plus;
        this.fieldGoalMissed = fieldGoalMissed;
        this.defensiveTouchdown = defensiveTouchdown;
        this.defensiveSpecialTeamsTouchdown = defensiveSpecialTeamsTouchdown;
        this.specialTeamsTouchdown = specialTeamsTouchdown;
        this.sack = sack;
        this.interception = interception;
        this.forcedFumble = forcedFumble;
        this.defensiveForcedFumble = defensiveForcedFumble;
        this.specialTeamsForcedFumble = specialTeamsForcedFumble;
        this.defensiveFumbleRecovery = defensiveFumbleRecovery;
        this.specialTeamsFumbleRecovery = specialTeamsFumbleRecovery;
        this.blockedKick = blockedKick;
        this.safety = safety;
        this.pointsAllowed0 = pointsAllowed0;
        this.pointsAllowed1_6 = pointsAllowed1_6;
        this.pointsAllowed7_13 = pointsAllowed7_13;
        this.pointsAllowed14_20 = pointsAllowed14_20;
        this.pointsAllowed21_27 = pointsAllowed21_27;
        this.pointsAllowed28_34 = pointsAllowed28_34;
        this.pointsAllowed35Plus = pointsAllowed35Plus;
    }

    public static ScoringSettings getSettings(JsonElement json) {
        Map<String, JsonElement> m = json.getAsJsonObject().asMap();
        return new ScoringSettings(
                m.get("pass_yd").getAsDouble(),
                m.get("pass_td").getAsDouble(),
                m.get("pass_int").getAsDouble(),
                m.get("pass_2pt").getAsDouble(),
                m.get("rush_yd").getAsDouble(),
                m.get("rush_td").getAsDouble(),
                m.get("rush_2pt").getAsDouble(),
                m.get("rec").getAsDouble(),
                m.get("rec_yd").getAsDouble(),
                m.get("rec_td").getAsDouble(),
                m.get("rec_2pt").getAsDouble(),
                m.get("fum").getAsDouble(),
                m.get("fum_lost").getAsDouble(),
                m.get("fum_rec").getAsDouble(),
                m.get("fum_rec_td").getAsDouble(),
                m.get("xpm").getAsDouble(),
                m.get("xpmiss").getAsDouble(),
                m.get("fgm_0_19").getAsDouble(),
                m.get("fgm_20_29").getAsDouble(),
                m.get("fgm_30_39").getAsDouble(),
                m.get("fgm_40_49").getAsDouble(),
                m.get("fgm_50_59").getAsDouble(),
                m.get("fgm_60p").getAsDouble(),
                m.get("fgmiss").getAsDouble(),
                m.get("def_td").getAsDouble(),
                m.get("def_st_td").getAsDouble(),
                m.get("st_td").getAsDouble(),
                m.get("sack").getAsDouble(),
                m.get("int").getAsDouble(),
                m.get("ff").getAsDouble(),
                m.get("def_st_ff").getAsDouble(),
                m.get("st_ff").getAsDouble(),
                m.get("def_st_fum_rec").getAsDouble(),
                m.get("st_fum_rec").getAsDouble(),
                m.get("blk_kick").getAsDouble(),
                m.get("safe").getAsDouble(),
                m.get("pts_allow_0").getAsDouble(),
                m.get("pts_allow_1_6").getAsDouble(),
                m.get("pts_allow_7_13").getAsDouble(),
                m.get("pts_allow_14_20").getAsDouble(),
                m.get("pts_allow_21_27").getAsDouble(),
                m.get("pts_allow_28_34").getAsDouble(),
                m.get("pts_allow_35p").getAsDouble()
        );
    }


    // -------------------------------------------------------------------------
    // Getters
    // -------------------------------------------------------------------------

    public double getPassingYards() { return passingYards; }
    public double getPassingTouchdown() { return passingTouchdown; }
    public double getPassingInterception() { return passingInterception; }
    public double getPassing2PtConversion() { return passing2PtConversion; }
    public double getRushingYards() { return rushingYards; }
    public double getRushingTouchdown() { return rushingTouchdown; }
    public double getRushing2PtConversion() { return rushing2PtConversion; }
    public double getReception() { return reception; }
    public double getReceivingYards() { return receivingYards; }
    public double getReceivingTouchdown() { return receivingTouchdown; }
    public double getReceiving2PtConversion() { return receiving2PtConversion; }
    public double getFumble() { return fumble; }
    public double getFumbleLost() { return fumbleLost; }
    public double getFumbleRecovery() { return fumbleRecovery; }
    public double getFumbleRecoveryTouchdown() { return fumbleRecoveryTouchdown; }
    public double getExtraPointMade() { return extraPointMade; }
    public double getExtraPointMissed() { return extraPointMissed; }
    public double getFieldGoalMade0_19() { return fieldGoalMade0_19; }
    public double getFieldGoalMade20_29() { return fieldGoalMade20_29; }
    public double getFieldGoalMade30_39() { return fieldGoalMade30_39; }
    public double getFieldGoalMade40_49() { return fieldGoalMade40_49; }
    public double getFieldGoalMade50_59() { return fieldGoalMade50_59; }
    public double getFieldGoalMade60Plus() { return fieldGoalMade60Plus; }
    public double getFieldGoalMissed() { return fieldGoalMissed; }
    public double getDefensiveTouchdown() { return defensiveTouchdown; }
    public double getDefensiveSpecialTeamsTouchdown() { return defensiveSpecialTeamsTouchdown; }
    public double getSpecialTeamsTouchdown() { return specialTeamsTouchdown; }
    public double getSack() { return sack; }
    public double getInterception() { return interception; }
    public double getForcedFumble() { return forcedFumble; }
    public double getDefensiveForcedFumble() { return defensiveForcedFumble; }
    public double getSpecialTeamsForcedFumble() { return specialTeamsForcedFumble; }
    public double getDefensiveFumbleRecovery() { return defensiveFumbleRecovery; }
    public double getSpecialTeamsFumbleRecovery() { return specialTeamsFumbleRecovery; }
    public double getBlockedKick() { return blockedKick; }
    public double getSafety() { return safety; }
    public double getPointsAllowed0() { return pointsAllowed0; }
    public double getPointsAllowed1_6() { return pointsAllowed1_6; }
    public double getPointsAllowed7_13() { return pointsAllowed7_13; }
    public double getPointsAllowed14_20() { return pointsAllowed14_20; }
    public double getPointsAllowed21_27() { return pointsAllowed21_27; }
    public double getPointsAllowed28_34() { return pointsAllowed28_34; }
    public double getPointsAllowed35Plus() { return pointsAllowed35Plus; }


    // -------------------------------------------------------------------------
    // toString
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        return "ScoringSettings{" +
                "passingYards=" + passingYards +
                ", passingTouchdown=" + passingTouchdown +
                ", passingInterception=" + passingInterception +
                ", passing2PtConversion=" + passing2PtConversion +
                ", rushingYards=" + rushingYards +
                ", rushingTouchdown=" + rushingTouchdown +
                ", rushing2PtConversion=" + rushing2PtConversion +
                ", reception=" + reception +
                ", receivingYards=" + receivingYards +
                ", receivingTouchdown=" + receivingTouchdown +
                ", receiving2PtConversion=" + receiving2PtConversion +
                ", fumble=" + fumble +
                ", fumbleLost=" + fumbleLost +
                ", fumbleRecovery=" + fumbleRecovery +
                ", fumbleRecoveryTouchdown=" + fumbleRecoveryTouchdown +
                ", extraPointMade=" + extraPointMade +
                ", extraPointMissed=" + extraPointMissed +
                ", fieldGoalMade0_19=" + fieldGoalMade0_19 +
                ", fieldGoalMade20_29=" + fieldGoalMade20_29 +
                ", fieldGoalMade30_39=" + fieldGoalMade30_39 +
                ", fieldGoalMade40_49=" + fieldGoalMade40_49 +
                ", fieldGoalMade50_59=" + fieldGoalMade50_59 +
                ", fieldGoalMade60Plus=" + fieldGoalMade60Plus +
                ", fieldGoalMissed=" + fieldGoalMissed +
                ", defensiveTouchdown=" + defensiveTouchdown +
                ", defensiveSpecialTeamsTouchdown=" + defensiveSpecialTeamsTouchdown +
                ", specialTeamsTouchdown=" + specialTeamsTouchdown +
                ", sack=" + sack +
                ", interception=" + interception +
                ", forcedFumble=" + forcedFumble +
                ", defensiveForcedFumble=" + defensiveForcedFumble +
                ", specialTeamsForcedFumble=" + specialTeamsForcedFumble +
                ", defensiveFumbleRecovery=" + defensiveFumbleRecovery +
                ", specialTeamsFumbleRecovery=" + specialTeamsFumbleRecovery +
                ", blockedKick=" + blockedKick +
                ", safety=" + safety +
                ", pointsAllowed0=" + pointsAllowed0 +
                ", pointsAllowed1_6=" + pointsAllowed1_6 +
                ", pointsAllowed7_13=" + pointsAllowed7_13 +
                ", pointsAllowed14_20=" + pointsAllowed14_20 +
                ", pointsAllowed21_27=" + pointsAllowed21_27 +
                ", pointsAllowed28_34=" + pointsAllowed28_34 +
                ", pointsAllowed35Plus=" + pointsAllowed35Plus +
                '}';
    }
}