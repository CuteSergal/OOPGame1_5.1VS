package ru.vsu.cs.shashmashki;

public class Game {

    //Field field;
    private Manager manager;
    private IPlayer win;

    public void gameStart(){
        //field = new Field();
        manager = new Manager(true,true);
        win=null;
        while (win==null){
            //currentPlayer.requestInput(field);
            manager.doAction();
            //
        };
    }
}