package org.sleeper.roster;

public class Record {
    private int wins;
    private int ties;
    private int losses;

    Record(int wins, int ties, int losses) {
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
    }

    public String toString() {
        return String.format("Record(%dW %dT %dL)", wins, ties, losses);
    }

    public int getWins() { return wins; }
    public int getTies() { return ties; }
    public int getLosses() { return losses; }
}
