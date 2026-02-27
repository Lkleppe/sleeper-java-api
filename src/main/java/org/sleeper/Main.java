package org.sleeper;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Logger logger = Logger.getLogger("Sleeper API Logger");
    static void main() throws Exception {
        String leagueID = "1255633238693523456";

        Sleeper sleeper = new Sleeper(leagueID);

//        sleeper.getLeague();
//        sleeper.getLeagueUsers();
        sleeper.getLeagueRosters();
//        sleeper.getLeagueWinnersBracket();
    }
}
