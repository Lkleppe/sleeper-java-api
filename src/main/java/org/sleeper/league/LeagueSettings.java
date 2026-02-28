package org.sleeper.league;

import com.google.gson.JsonElement;

import java.util.Map;

public class LeagueSettings {

    // Draft Settings
    private final int draftRounds;
    private final int maxKeepers;

    // Scoring & Match Settings
    private final int leagueType;
    private final boolean bestBall;
    private final boolean leagueAverageMatch;

    // Season Structure
    private final int currentWeek;
    private final int startWeek;
    private final int lastScoredWeek;
    private final int lastReportWeek;

    // Playoff Settings
    private final int playoffStartWeek;
    private final int playoffTeams;
    private final int playoffType;
    private final int playoffRoundType;
    private final int playoffSeedType;

    // Team & Roster Settings
    private final int numTeams;
    private final int reserveSlots;
    private final int maxSubstitutions;
    private final int rosterCapacityOverride;

    // Reserve/IR Eligibility Settings
    private final boolean reserveAllowOut;
    private final boolean reserveAllowNa;
    private final boolean reserveAllowDoubtful;
    private final boolean reserveAllowDnr;
    private final boolean reserveAllowSuspended;
    private final boolean reserveAllowCovid;

    // Taxi Squad Settings
    private final int taxiSquadSlots;
    private final int taxiSquadYears;
    private final int taxiSigningDeadlineWeek;
    private final boolean taxiAllowVeterans;

    // Waiver Settings
    private final int waiverType;
    private final int waiverBudget;
    private final int waiverMinimumBid;
    private final int waiverProcessDayOfWeek;   // 0=Sun, 1=Mon, 2=Tue, ...
    private final int waiverClearDays;
    private final boolean dailyWaivers;
    private final int dailyWaiversHour;
    private final int dailyWaiversDays;          // bitmask of days daily waivers run
    private final int dailyWaiversLastRan;
    private final boolean faabSuggestionsEnabled;
    private final boolean addsDisabled;
    private final boolean offseasonAddsAllowed;

    // Trade Settings
    private final boolean tradesDisabled;
    private final boolean pickTradingAllowed;
    private final int tradeDeadlineWeek;
    private final int tradeReviewDays;

    // Trade Veto Settings
    private final int vetoVotesRequired;
    private final boolean vetoAutoPoll;
    private final boolean vetoShowVotes;

    // Lineup & Lock Settings
    private final boolean benchLock;
    private final boolean subLockIfStarterActive;
    private final int subStartTimeEligibility;
    private final boolean commissionerDirectInviteOnly;


    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    public LeagueSettings(
            int draftRounds,
            int maxKeepers,
            int leagueType,
            boolean bestBall,
            boolean leagueAverageMatch,
            int currentWeek,
            int startWeek,
            int lastScoredWeek,
            int lastReportWeek,
            int playoffStartWeek,
            int playoffTeams,
            int playoffType,
            int playoffRoundType,
            int playoffSeedType,
            int numTeams,
            int reserveSlots,
            int maxSubstitutions,
            int rosterCapacityOverride,
            boolean reserveAllowOut,
            boolean reserveAllowNa,
            boolean reserveAllowDoubtful,
            boolean reserveAllowDnr,
            boolean reserveAllowSuspended,
            boolean reserveAllowCovid,
            int taxiSquadSlots,
            int taxiSquadYears,
            int taxiSigningDeadlineWeek,
            boolean taxiAllowVeterans,
            int waiverType,
            int waiverBudget,
            int waiverMinimumBid,
            int waiverProcessDayOfWeek,
            int waiverClearDays,
            boolean dailyWaivers,
            int dailyWaiversHour,
            int dailyWaiversDays,
            int dailyWaiversLastRan,
            boolean faabSuggestionsEnabled,
            boolean addsDisabled,
            boolean offseasonAddsAllowed,
            boolean tradesDisabled,
            boolean pickTradingAllowed,
            int tradeDeadlineWeek,
            int tradeReviewDays,
            int vetoVotesRequired,
            boolean vetoAutoPoll,
            boolean vetoShowVotes,
            boolean benchLock,
            boolean subLockIfStarterActive,
            int subStartTimeEligibility,
            boolean commissionerDirectInviteOnly
    ) {
        this.draftRounds = draftRounds;
        this.maxKeepers = maxKeepers;
        this.leagueType = leagueType;
        this.bestBall = bestBall;
        this.leagueAverageMatch = leagueAverageMatch;
        this.currentWeek = currentWeek;
        this.startWeek = startWeek;
        this.lastScoredWeek = lastScoredWeek;
        this.lastReportWeek = lastReportWeek;
        this.playoffStartWeek = playoffStartWeek;
        this.playoffTeams = playoffTeams;
        this.playoffType = playoffType;
        this.playoffRoundType = playoffRoundType;
        this.playoffSeedType = playoffSeedType;
        this.numTeams = numTeams;
        this.reserveSlots = reserveSlots;
        this.maxSubstitutions = maxSubstitutions;
        this.rosterCapacityOverride = rosterCapacityOverride;
        this.reserveAllowOut = reserveAllowOut;
        this.reserveAllowNa = reserveAllowNa;
        this.reserveAllowDoubtful = reserveAllowDoubtful;
        this.reserveAllowDnr = reserveAllowDnr;
        this.reserveAllowSuspended = reserveAllowSuspended;
        this.reserveAllowCovid = reserveAllowCovid;
        this.taxiSquadSlots = taxiSquadSlots;
        this.taxiSquadYears = taxiSquadYears;
        this.taxiSigningDeadlineWeek = taxiSigningDeadlineWeek;
        this.taxiAllowVeterans = taxiAllowVeterans;
        this.waiverType = waiverType;
        this.waiverBudget = waiverBudget;
        this.waiverMinimumBid = waiverMinimumBid;
        this.waiverProcessDayOfWeek = waiverProcessDayOfWeek;
        this.waiverClearDays = waiverClearDays;
        this.dailyWaivers = dailyWaivers;
        this.dailyWaiversHour = dailyWaiversHour;
        this.dailyWaiversDays = dailyWaiversDays;
        this.dailyWaiversLastRan = dailyWaiversLastRan;
        this.faabSuggestionsEnabled = faabSuggestionsEnabled;
        this.addsDisabled = addsDisabled;
        this.offseasonAddsAllowed = offseasonAddsAllowed;
        this.tradesDisabled = tradesDisabled;
        this.pickTradingAllowed = pickTradingAllowed;
        this.tradeDeadlineWeek = tradeDeadlineWeek;
        this.tradeReviewDays = tradeReviewDays;
        this.vetoVotesRequired = vetoVotesRequired;
        this.vetoAutoPoll = vetoAutoPoll;
        this.vetoShowVotes = vetoShowVotes;
        this.benchLock = benchLock;
        this.subLockIfStarterActive = subLockIfStarterActive;
        this.subStartTimeEligibility = subStartTimeEligibility;
        this.commissionerDirectInviteOnly = commissionerDirectInviteOnly;
    }


    // -------------------------------------------------------------------------
    // Getters
    // -------------------------------------------------------------------------

    public int getDraftRounds() { return draftRounds; }
    public int getMaxKeepers() { return maxKeepers; }
    public int getLeagueType() { return leagueType; }
    public boolean isBestBall() { return bestBall; }
    public boolean isLeagueAverageMatch() { return leagueAverageMatch; }
    public int getCurrentWeek() { return currentWeek; }
    public int getStartWeek() { return startWeek; }
    public int getLastScoredWeek() { return lastScoredWeek; }
    public int getLastReportWeek() { return lastReportWeek; }
    public int getPlayoffStartWeek() { return playoffStartWeek; }
    public int getPlayoffTeams() { return playoffTeams; }
    public int getPlayoffType() { return playoffType; }
    public int getPlayoffRoundType() { return playoffRoundType; }
    public int getPlayoffSeedType() { return playoffSeedType; }
    public int getNumTeams() { return numTeams; }
    public int getReserveSlots() { return reserveSlots; }
    public int getMaxSubstitutions() { return maxSubstitutions; }
    public int getRosterCapacityOverride() { return rosterCapacityOverride; }
    public boolean isReserveAllowOut() { return reserveAllowOut; }
    public boolean isReserveAllowNa() { return reserveAllowNa; }
    public boolean isReserveAllowDoubtful() { return reserveAllowDoubtful; }
    public boolean isReserveAllowDnr() { return reserveAllowDnr; }
    public boolean isReserveAllowSuspended() { return reserveAllowSuspended; }
    public boolean isReserveAllowCovid() { return reserveAllowCovid; }
    public int getTaxiSquadSlots() { return taxiSquadSlots; }
    public int getTaxiSquadYears() { return taxiSquadYears; }
    public int getTaxiSigningDeadlineWeek() { return taxiSigningDeadlineWeek; }
    public boolean isTaxiAllowVeterans() { return taxiAllowVeterans; }
    public int getWaiverType() { return waiverType; }
    public int getWaiverBudget() { return waiverBudget; }
    public int getWaiverMinimumBid() { return waiverMinimumBid; }
    public int getWaiverProcessDayOfWeek() { return waiverProcessDayOfWeek; }
    public int getWaiverClearDays() { return waiverClearDays; }
    public boolean isDailyWaivers() { return dailyWaivers; }
    public int getDailyWaiversHour() { return dailyWaiversHour; }
    public int getDailyWaiversDays() { return dailyWaiversDays; }
    public int getDailyWaiversLastRan() { return dailyWaiversLastRan; }
    public boolean isFaabSuggestionsEnabled() { return faabSuggestionsEnabled; }
    public boolean isAddsDisabled() { return addsDisabled; }
    public boolean isOffseasonAddsAllowed() { return offseasonAddsAllowed; }
    public boolean isTradesDisabled() { return tradesDisabled; }
    public boolean isPickTradingAllowed() { return pickTradingAllowed; }
    public int getTradeDeadlineWeek() { return tradeDeadlineWeek; }
    public int getTradeReviewDays() { return tradeReviewDays; }
    public int getVetoVotesRequired() { return vetoVotesRequired; }
    public boolean isVetoAutoPoll() { return vetoAutoPoll; }
    public boolean isVetoShowVotes() { return vetoShowVotes; }
    public boolean isBenchLock() { return benchLock; }
    public boolean isSubLockIfStarterActive() { return subLockIfStarterActive; }
    public int getSubStartTimeEligibility() { return subStartTimeEligibility; }
    public boolean isCommissionerDirectInviteOnly() { return commissionerDirectInviteOnly; }

    public static LeagueSettings getSettings(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();
        return new LeagueSettings(
                jsonMap.get("draft_rounds").getAsInt(),
                jsonMap.get("max_keepers").getAsInt(),
                jsonMap.get("type").getAsInt(),
                jsonMap.get("best_ball").getAsInt() == 1,
                jsonMap.get("league_average_match").getAsInt() == 1,
                jsonMap.get("leg").getAsInt(),
                jsonMap.get("start_week").getAsInt(),
                jsonMap.get("last_scored_leg").getAsInt(),
                jsonMap.get("last_report").getAsInt(),
                jsonMap.get("playoff_week_start").getAsInt(),
                jsonMap.get("playoff_teams").getAsInt(),
                jsonMap.get("playoff_type").getAsInt(),
                jsonMap.get("playoff_round_type").getAsInt(),
                jsonMap.get("playoff_seed_type").getAsInt(),
                jsonMap.get("num_teams").getAsInt(),
                jsonMap.get("reserve_slots").getAsInt(),
                jsonMap.get("max_subs").getAsInt(),
                jsonMap.get("capacity_override").getAsInt(),
                jsonMap.get("reserve_allow_out").getAsInt() == 1,
                jsonMap.get("reserve_allow_na").getAsInt() == 1,
                jsonMap.get("reserve_allow_doubtful").getAsInt() == 1,
                jsonMap.get("reserve_allow_dnr").getAsInt() == 1,
                jsonMap.get("reserve_allow_sus").getAsInt() == 1,
                jsonMap.get("reserve_allow_cov").getAsInt() == 1,
                jsonMap.get("taxi_slots").getAsInt(),
                jsonMap.get("taxi_years").getAsInt(),
                jsonMap.get("taxi_deadline").getAsInt(),
                jsonMap.get("taxi_allow_vets").getAsInt() == 1,
                jsonMap.get("waiver_type").getAsInt(),
                jsonMap.get("waiver_budget").getAsInt(),
                jsonMap.get("waiver_bid_min").getAsInt(),
                jsonMap.get("waiver_day_of_week").getAsInt(),
                jsonMap.get("waiver_clear_days").getAsInt(),
                jsonMap.get("daily_waivers").getAsInt() == 1,
                jsonMap.get("daily_waivers_hour").getAsInt(),
                jsonMap.get("daily_waivers_days").getAsInt(),
                jsonMap.get("daily_waivers_last_ran").getAsInt(),
                jsonMap.get("faab_suggestions").getAsInt() == 1,
                jsonMap.get("disable_adds").getAsInt() == 1,
                jsonMap.get("offseason_adds").getAsInt() == 1,
                jsonMap.get("disable_trades").getAsInt() == 1,
                jsonMap.get("pick_trading").getAsInt() == 1,
                jsonMap.get("trade_deadline").getAsInt(),
                jsonMap.get("trade_review_days").getAsInt(),
                jsonMap.get("veto_votes_needed").getAsInt(),
                jsonMap.get("veto_auto_poll").getAsInt() == 1,
                jsonMap.get("veto_show_votes").getAsInt() == 1,
                jsonMap.get("bench_lock").getAsInt() == 1,
                jsonMap.get("sub_lock_if_starter_active").getAsInt() == 1,
                jsonMap.get("sub_start_time_eligibility").getAsInt(),
                jsonMap.get("commissioner_direct_invite").getAsInt() == 1
        );
    }


    @Override
    public String toString() {
        return "LeagueSettings{" +
                "draftRounds=" + draftRounds +
                ", maxKeepers=" + maxKeepers +
                ", leagueType=" + leagueType +
                ", bestBall=" + bestBall +
                ", leagueAverageMatch=" + leagueAverageMatch +
                ", currentWeek=" + currentWeek +
                ", startWeek=" + startWeek +
                ", lastScoredWeek=" + lastScoredWeek +
                ", lastReportWeek=" + lastReportWeek +
                ", playoffStartWeek=" + playoffStartWeek +
                ", playoffTeams=" + playoffTeams +
                ", playoffType=" + playoffType +
                ", playoffRoundType=" + playoffRoundType +
                ", playoffSeedType=" + playoffSeedType +
                ", numTeams=" + numTeams +
                ", reserveSlots=" + reserveSlots +
                ", maxSubstitutions=" + maxSubstitutions +
                ", rosterCapacityOverride=" + rosterCapacityOverride +
                ", reserveAllowOut=" + reserveAllowOut +
                ", reserveAllowNa=" + reserveAllowNa +
                ", reserveAllowDoubtful=" + reserveAllowDoubtful +
                ", reserveAllowDnr=" + reserveAllowDnr +
                ", reserveAllowSuspended=" + reserveAllowSuspended +
                ", reserveAllowCovid=" + reserveAllowCovid +
                ", taxiSquadSlots=" + taxiSquadSlots +
                ", taxiSquadYears=" + taxiSquadYears +
                ", taxiSigningDeadlineWeek=" + taxiSigningDeadlineWeek +
                ", taxiAllowVeterans=" + taxiAllowVeterans +
                ", waiverType=" + waiverType +
                ", waiverBudget=" + waiverBudget +
                ", waiverMinimumBid=" + waiverMinimumBid +
                ", waiverProcessDayOfWeek=" + waiverProcessDayOfWeek +
                ", waiverClearDays=" + waiverClearDays +
                ", dailyWaivers=" + dailyWaivers +
                ", dailyWaiversHour=" + dailyWaiversHour +
                ", dailyWaiversDays=" + dailyWaiversDays +
                ", dailyWaiversLastRan=" + dailyWaiversLastRan +
                ", faabSuggestionsEnabled=" + faabSuggestionsEnabled +
                ", addsDisabled=" + addsDisabled +
                ", offseasonAddsAllowed=" + offseasonAddsAllowed +
                ", tradesDisabled=" + tradesDisabled +
                ", pickTradingAllowed=" + pickTradingAllowed +
                ", tradeDeadlineWeek=" + tradeDeadlineWeek +
                ", tradeReviewDays=" + tradeReviewDays +
                ", vetoVotesRequired=" + vetoVotesRequired +
                ", vetoAutoPoll=" + vetoAutoPoll +
                ", vetoShowVotes=" + vetoShowVotes +
                ", benchLock=" + benchLock +
                ", subLockIfStarterActive=" + subLockIfStarterActive +
                ", subStartTimeEligibility=" + subStartTimeEligibility +
                ", commissionerDirectInviteOnly=" + commissionerDirectInviteOnly +
                '}';
    }
}
