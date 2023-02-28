package org.example;



import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;


class Tictactoe{
    static char[][] symbol=new char[3][3];
    static PrintStream li=new PrintStream((new FileOutputStream(FileDescriptor.out)));
    Tictactoe(){
        gothrough();
    }
    static void gothrough(){
        for(int i=0;i<symbol.length;i++){
            for(int j=0;j<symbol[i].length;j++)
            {
                symbol[i][j]=' ';
            }
        }
    }
    static void displaytictactoe(){
        li.println("--------------");
        for(int i=0;i<symbol.length;i++){
            li.print("| ");
            for(int j=0;j<symbol.length;j++)
            {

                li.print(symbol[i][j]+" | ");
            }
            li.println();
            li.println("--------------");
        }
    }
    static void placesymbol(int row,int column,char mark){
        if(row>=0 && row<=2 && column>=0 && column<=2){
            symbol[row][column]=mark;
        }
        else {
            li.println("Invalid input");
        }
    }
    static boolean columnwin(){
        for(int j=0;j<=2;j++){
            if(symbol[0][j]!=' ' && symbol[0][j]==symbol[1][j] && symbol[1][j]==symbol[2][j]){
                return true;
            }
        }
        return  false;
    }
    static boolean rowwin(){
        for(int i=0;i<=2;i++){
            if(symbol[i][0]!=' ' && symbol[i][0]==symbol[i][1] && symbol[i][1]==symbol[i][2]){
                return true;
            }
        }
        return  false;
    }
    static boolean diagonalwin(){
        return(symbol[0][0]!=' ' && symbol[0][0]==symbol[1][1] && symbol[1][1]==symbol[2][2] || symbol[0][2]!=' ' && symbol[0][2]==symbol[1][1] && symbol[1][1]==symbol[2][0]);

    }
}