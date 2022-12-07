package com.apolis.javapractice;
// find prime number 1 to n
public class PrimeNumber {
    public static void main(String[] args) {

        int n=100;

//        System.out.println(3+" "+5+" "+ 7);
        for(int i=1;i<=n;i++){
            int count=0;
//            if(i%2==0 || i%3==0 || i%5==0 || i%7==0 ){
//                continue;
//            }
//            else{
//                count++;
//                System.out.println(i);
//            }
         for(int j=1;j<=n;j++){
             if(i%j==0){
                 count++;
             }

         }
         if(count==2){
             System.out.println(i);

         }

        }
//        System.out.println(count);

    }
}
