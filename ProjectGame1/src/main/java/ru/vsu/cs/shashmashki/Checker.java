package ru.vsu.cs.shashmashki;

public class Checker {
    private boolean isBlack;
    private Rule rule;

    public Checker(boolean isBlack){
        this.isBlack = isBlack;
        this.rule=Rule.regular;
    }

    public void BecomeKing(){
        this.rule=Rule.king;
    }

    //
}
