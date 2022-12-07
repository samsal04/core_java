package com.apolis.treelinkedlist;

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class NthNodeRemove {
    public static void main(String[] args) {

        ListNode head= new ListNode();

        head.val=1;
        head.val=2;
        head.val=3;
        head.val=4;
        head.val=5;
        System.out.println(head.toString());
        int count =0;
        int n=5;
       while(head.next!=null){

           if (count!=n){
//               removeNthFromEnd(head.next,count++);
           }else if (count==n){
               head.next= head.next.next;
           }

       }


    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}