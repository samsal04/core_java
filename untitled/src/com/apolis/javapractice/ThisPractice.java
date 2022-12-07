    package com.apolis.javapractice;

    class ThisExampleClass{
        int a;
        int b;

        public ThisExampleClass(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }



    public class ThisPractice {

         public static void main(String[] args) {
            int a=10;
            int b=20;

            String s="asdajndas";

           // s.
             ThisExampleClass example1= new ThisExampleClass(a,b) ;

        }
    }
