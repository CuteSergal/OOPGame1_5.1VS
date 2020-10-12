package ru.vsu.cs.shashmashki;

public class Rule {
    private int distToEnemy, distAfterEnemy;

    private boolean canBackwards;
    public static Rule regular = new Rule(1,1,false);
    public static Rule king = new Rule(10,10,true);
    public Rule(int distToEnemy, int distAfterEnemy, boolean canBackwards) {
        this.distToEnemy = distToEnemy;
        this.distAfterEnemy = distAfterEnemy;
        this.canBackwards = canBackwards;
    }

    public boolean isCanBackwards() {
        return canBackwards;
    }
}
