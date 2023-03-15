package com.apolis.codewars;

public class LinkedList {
    Node head;

    public int findLengthOfLoop(Node node) {
        Node hare = node;
        Node tortoise = node;
        boolean loopExists = false;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;

            if (hare == tortoise) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists) {
            return 0;
        }

        int loopLength = 0;
        tortoise = node;

        while (hare != tortoise) {
            hare = hare.next;
            tortoise = tortoise.next;
            loopLength++;
        }

        return loopLength;
    }
}
