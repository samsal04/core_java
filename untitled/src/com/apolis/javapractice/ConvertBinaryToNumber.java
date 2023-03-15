package com.apolis.javapractice;

//String S = "1001";
//2^0*1 + 2^1*0 + 2^2*0 + 2^3*1 =9
//number =9;
// if number is odd subtract 1
//if number is even divide by 2

// find out the no of steps to make the number become 0

// step - 1 is 9-1
// step -2  is 8/2
// step - 3 is 4/2
//step -4  is 2/2
//step- 5 1-1
//output is 5

public class ConvertBinaryToNumber {
    private static int numConversion(String s) {

        StringBuilder stringBuilder= new StringBuilder(s);
        String sNew=String.valueOf(stringBuilder.reverse());

        int number=0;
        // 1001

        for(int i=0;i<sNew.length();i++){

            if (sNew.charAt(i)=='1'){
                number= number+powerFunction(i);
            }else {
                continue;
            }
        }
        int count=0;
        while(number!=0){

            if (number%2==0){
                number=number/2;
            }
            else if(number%2==1){
                number= number-1;
            }
            count++;
        }
        return count;
    }

    private static int powerFunction(int i) {
        int num=1;
        while(i>0){
           num= 2*num;
           i--;
        }
        return num;
    }

    public static void main(String[] args) {
        String s="1001";
        System.out.println(numConversion(s));
    }
}
