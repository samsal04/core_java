package com.apolis.applecode;

import java.util.ArrayList;
import java.util.List;

//Help Ankur To Win The Game Ankur is playing a game with Deepika....
//Help Ankur To Win The Game
//
//Ankur is playing a game with Deepika. Rule of game is described below:-
//There are N jars. Each jar contains 1 or more ball(s).
//During each turn, a player selects a jar and takes out 1 or more ball(s).
//The last player to take out the last ball(s) wins the game.
//Ankur makes a modification to the game because hi is bored .
//For the first 50 moves,the game is played in the following manner:
//
//Step1:- Ankur adds a jar containing a non-zero number of balls.
//Step2:- Deepika adds a jar containing a non-zero number of balls.
//Step3:- Ankur selects a jar and takes out 1 or more balls.
//Step4:- Deepika selects a jar and takes out 1 or more balls.
//
//After the first 50 moves, the usual rules of the game are followed, and the addition of jars does not takes place.
//Ankur plays first . Ankur wants to know the minimum number of balls the first additional jar should contain
//(which he is adding in the first turn of the game ) in order for him to win.
//If no such jar exists,print -1.
//
//Find the minimum number of balls Ankur should add to win the game.
//
//        INPUT:
//        The first line contains an integer N, denoting the number of jars.
//        The next  contains N integer. The ith    integer denotes the number of balls in the ith
//        jar..
//
//        OUTPUT:
//        Print the answer
public class WalmartGame {
    private static int game(List<Integer> list) {

        int jar=0;
        int turn=0;
        int count=0;
        int removeIndex=0;

        while (list.size()==0){

            if(list.contains(0)){
                removeIndex=list.indexOf(0);
                list.remove(removeIndex);
            }



        }


        return count;
    }
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        System.out.println(game(list));

    }
}
