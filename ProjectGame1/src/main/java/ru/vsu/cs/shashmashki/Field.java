package ru.vsu.cs.shashmashki;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private Checker[][] checkers1;//\\\\\\\\\
    private Checker[][] checkers2;///////////

    public Field() {
        Checker tmp;
        final int l1=8, l2=7;
        checkers1 = new Checker[l1][l2];
        checkers2 = new Checker[l2][l1];
        for (int i=0; i<l1; i++){
            for (int j = 0; j < l2; j++) {
                if ((i+j>2)&&(i+j<10)&&(i-j<5)&&(j-i<-1)){
                    //верхние
                    tmp = new Checker(true);
                    checkers1[i][j]= tmp;
                    checkers2[j][i]= tmp;
                }else if ((i+j>2)&&(i+j<10)&&(i-j<0)&&(j-i<4)){
                    //нижние
                    tmp = new Checker(false);
                    checkers1[i][j]= tmp;
                    checkers2[j][i]= tmp;
                }else{
                    checkers1[i][j]= null;
                    checkers2[j][i]= null;
                }
            }
        }
    }

    public void printField(){

    }

    public void convertToRect(){
        //ОЧЕНЬ ПОСТАРАТЬСЯ сделать
        //либо без этого, показать работоспособность юнит-тестами
    }
}
