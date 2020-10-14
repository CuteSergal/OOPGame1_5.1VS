package ru.vsu.cs.shashmashki;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    //private ArrayList<Checker> =
    //{Checker.allCheckers.get(0);}

    private Field field;
    private IPlayer player1;
    private IPlayer player2;
    private IPlayer currentPlayer;

    public Manager(boolean bulka1, boolean boolka2) {
        this.field = new Field();
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public void doAction(){
        boolean kostbIlb = false;
        List<Checker> available = new ArrayList<>();
        Tile currChecker=null;
        Tile currTile=null;
        //заполнить available доступными для хода этому игроку шашками
        //проходом по всем шашкам, подпадающим под правила
        //методом из нового класса, проверяющего только и только доступные ходы шашки
        while(!available.contains(currChecker)){
            currChecker = currentPlayer.requestInput(field);
        }

        //available = Something.fillAll(currChecker);//метод покажет все ходы - и просто ходы, и с убийствами
        do { //проверяем, возможны ли ходы шашкой
            do {//делаем эти ходы, tick
                //заполнить доступными тайлами и каждый раз внутри цикла заполнять лист снова, пушто шашка ХОДИТ
                currTile = currentPlayer.requestTile(field);

            } while(!available.contains(currTile));
            //сделать ход шашкой, с перемещением и убийством!!!!!!!!!!!!!!!!!! отдельный метод - perform совершить
            //подается шашка, точка прохождения, убийства, всякое такое,
            //available = Something.fillKill(currChecker);//метод должен: если можем прервать, то в массив авайлабле добавляется только null
            //всякая инфа для fillkill о том, что дамка может прерваться

        } while (available.contains(currTile));
        //tock
        //switchPlayer();
    }

}
