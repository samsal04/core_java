package com.apolis.codewars;
//The rgb function is incomplete.
//Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
//Valid decimal values for RGB are 0 - 255.
//Any values that fall out of that range must be rounded to the closest valid value.
//
//        Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
//
//        The following are examples of expected output values:
//
//        RgbToHex.rgb(255, 255, 255) // returns FFFFFF
//        RgbToHex.rgb(255, 255, 300) // returns FFFFFF
//        RgbToHex.rgb(0, 0, 0)       // returns 000000
//        RgbToHex.rgb(148, 0, 211)   // returns 9400D3

public class RgbToHex {

    private static String rgb(int r, int g, int b) {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(decToHex(r));
        stringBuilder.append(decToHex(g));
        stringBuilder.append(decToHex(b));

        return stringBuilder.toString();
    }

    private static String decToHex(int num) {
        String hex="";
        while (num!=0){
            int reminder= num%16;
            if(reminder<=9){
                hex=reminder+hex;
            }else {
                hex=(char)(reminder-10+'A')+hex;
            }
            num=num/16;
        }
        System.out.println(hex);
        if(hex.length()==1){
            return "";
        }
        return hex;
    }

    public static void main(String[] args) {
        int r=255;
        int g=255;
        int b=255;
        System.out.println(rgb(r,g,b));
    }
}
