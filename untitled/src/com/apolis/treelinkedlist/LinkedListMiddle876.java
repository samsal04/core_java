package com.apolis.treelinkedlist;

//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.
//
//
//        Example 1:
//        Input: head = [1,2,3,4,5]
//        Output: [3,4,5]
//        Explanation: The middle node of the list is node 3.
//
//        Example 2:
//        Input: head = [1,2,3,4,5,6]
//        Output: [4,5,6]
//        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

/* Logic
    1) Use two pointers to traverse the linked list. First will traverse to next while second will traverse to next.next
    2) Return the first pointer when the second pointer will reach the end.

 */

public class LinkedListMiddle876 {
    public static void main(String[] args) {
        ListNode head= new ListNode();

//        for(int i=1;i<=5;i++){
//            if(head==null) {
//                head.val = i;
//                head = head.next;
//            }
//        }
//
//        System.out.println(head);

        ListNode slow= head;
        ListNode fast= head;

        while(slow!=null && fast !=null){
            slow= slow.next;
            fast=fast.next.next;
        }


    }
}
