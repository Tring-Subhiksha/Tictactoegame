package org.example;

import java.util.Scanner;

class Humanmove extends Tictactoe{
    String name;
    char symbol;
    Humanmove(String name1,char symbol1){
        this.name=name1;
        this.symbol=symbol1;
    }
    void move(){
        Scanner sc=new Scanner(System.in);
        int r;
        int c;
        do {
            li.println("Enter the row number:");
            r = sc.nextInt();
            li.println("Enter the column number:");
            c = sc.nextInt();
        }while (!validmove(r,c));
        Tictactoe.placesymbol(r,c,symbol);
    }
    boolean validmove(int row,int column){
        if(row>=0 && row<=2 && column>=0 && column<=2){
            if(Tictactoe.symbol[row][column]==' '){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }
}