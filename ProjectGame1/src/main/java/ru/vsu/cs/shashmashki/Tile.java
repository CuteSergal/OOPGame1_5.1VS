package ru.vsu.cs.shashmashki;

public class Tile {

    private Checker chkr;

    public Tile(){
        this.chkr=null;
    }

    public Checker getChkr() {
        return chkr;
    }

    public void setChkr(Checker chkr) {
        this.chkr = chkr;
    }

    //понадобится для того, чтобы работать в Field не с null, а с Tile
}