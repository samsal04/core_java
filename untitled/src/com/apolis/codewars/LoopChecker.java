package com.apolis.codewars;
import com.apolis.codewars.Node;

import java.util.HashMap;


//You are given a node that is the beginning of a linked list. This list contains a dangling piece and a loop.
//Your objective is to determine the length of the loop.
//
//        For example in the following picture the size of the dangling piece is 3 and the loop size is 12:
//
//// Use the `getNext()` method to get the following node.
//        node.getNext()
//
//        Notes:
//
//        do NOT mutate the nodes!
//        in some cases there may be only a loop, with no dangling piece

public class LoopChecker {
    public static void main(String[] args) {

        LinkedList list= new LinkedList();

        list.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

//        Node current =node;
//        int i=0;
//        HashMap<Node, Integer> map = new HashMap<>();
//        for(;!map.containsKey(list);i++){
//            map.put()
//        }

    }

}

