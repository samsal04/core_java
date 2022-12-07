package com.apolis.treelinkedlist;



public class StackInternalLogic {
//    ListNode node;
//    ListNode root;

    int[] arr=new int[10];
    int length=0;
//    int top=0;
    public boolean push(int num){
//        System.out.println(arr.length);
        if(length>=arr.length-1){
            System.out.println("Stack Full");
            return false;
        }else {
//            System.out.println(length);
            arr[++length] = num;
            return true;
        }
    }
    public int pop(){
        if(length<0){
            System.out.println(" Stack Empty");
            return -1;
        }
        else{
            return arr[length--];
        }

    }

    public int peek(){

        return arr[length];

    }


    public static void main(String[] args) {
        StackInternalLogic stackInternalLogic= new StackInternalLogic();
        stackInternalLogic.push(10);
        stackInternalLogic.push(15);
        stackInternalLogic.push(25);
        stackInternalLogic.push(1);
        stackInternalLogic.push(30);
//        System.out.println(stackInternalLogic.peek());
        stackInternalLogic.push(10);
        stackInternalLogic.push(15);
        stackInternalLogic.push(25);
        stackInternalLogic.push(100);
        stackInternalLogic.push(30);
        stackInternalLogic.push(3000);
        System.out.println(stackInternalLogic.pop());
//        stackInternalLogic.peek();
    }
}
