package org.sleeper.roster;

public class Points {
    private double fptsAgainst;
    private double fpts;

    Points(int fpts, int fptsAgainst, int fptsDecimal, int fptsAgainstDecimal) {
        this.fpts = (double)fpts + (double)fptsDecimal / 100.0;
        this.fptsAgainst = (double)fptsAgainst + (double)fptsAgainstDecimal / 100.0;
    }

    public String toString() {
        return String.format("Points(%.2f FOR, %.2f AGAINST)", fpts, fptsAgainst);
    }

    public static void main(String[] args) {
        System.out.println(new Points(1760, 1598, 44, 44));
    }
}
