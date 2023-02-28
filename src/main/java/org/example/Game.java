package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        int count=0;
        PrintStream li=new PrintStream((new FileOutputStream(FileDescriptor.out)));
        Scanner sc1=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        li.println("Enter the two person names");
        String name1=sc1.nextLine();
        String name2=sc1.nextLine();
        li.println("Enter two Symbols to play X or O");
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        Humanmove h1=new Humanmove(name1,c1);
        Humanmove h2=new Humanmove(name2,c2);
        Humanmove currentplayer;
        currentplayer=h1;
        while(true)
        {
            li.println(currentplayer.name + " Starts");
            currentplayer.move();
            count++;

            Tictactoe.displaytictactoe();
            if(Tictactoe.columnwin()||Tictactoe.rowwin()||Tictactoe.diagonalwin()){
                li.println(currentplayer.name+ " has won");
                System.exit(0);
            }

            else{
                if(currentplayer==h1){
                    currentplayer=h2;
                }
                else{
                    currentplayer=h1;
                }
            }

            if(count>=9)
            {
                li.println("Draw match!!");
                break;
            }
        }
    }
}