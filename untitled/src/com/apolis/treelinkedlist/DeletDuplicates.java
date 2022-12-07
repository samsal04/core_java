package com.apolis.treelinkedlist;
//Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
//leaving only distinct numbers from the original list. Return the linked list sorted as well.
//
//        Input: head = [1,2,3,3,4,4,5]
//        Output: [1,2,5]
//
//        Input: head = [1,1,1,2,3]
//        Output: [2,3]
public class DeletDuplicates {
    public static void main(String[] args) {

        Node head= new Node();
       head.val=1;
        head.val=1;
        head.val=1;
        head.val=2;
        head.val=3;

//        while(head.next!=null) {
//            System.out.println(head.toString());
//        }



        while(head!=null){
            if(head.next==null){
                break;
            }
            else if (head.val==head.next.val){

                head.next=head.next.next;

            }else {
                head=head.next;
            }

        }

    }
}
 class Node {
      int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }

     @Override
     public String toString() {
         return "Node{" +
                 "val=" + val +
                 ", next=" + next +
                 '}';
     }
 }