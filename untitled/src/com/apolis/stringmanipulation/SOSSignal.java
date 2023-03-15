package com.apolis.stringmanipulation;
//there is an SOS signal coming in. The shape of the signal will be a combination of “sos”. e.i., sossossossos.
//However, sometimes, there is an error signal coming in with wrong signal.
//For example, sosstssoosos.
//Count the number of wrong characters. In the example above, it is 2.


public class SOSSignal {
    private static int signalError(String s) {

        int count=0;
//        int subCount=2;

        for(int i=0;i<s.length();i=i+3){


            String sub= s.substring(i,i+3);
//            System.out.println(s.charAt(i)+"  "+i);
            System.out.println(sub);
            if(sub.equals("sos")){
                continue;
            }else {
                count++;
            }
//            subCount=subCount+3;
        }

        return count;
    }
    public static void main(String[] args) {

        String s="sosstssoosos";
        System.out.println(signalError(s));

    }
}
