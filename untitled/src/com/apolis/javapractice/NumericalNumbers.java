package com.apolis.javapractice;
//calculate number of numerical digits in string

public class NumericalNumbers {
    public static int numbers(String string){
        char[] chars= string.toCharArray();
        int count=0;

        for(int i=0;i<chars.length;i++) {
            if (isNumber(chars[i])) {
                count++;
            }else {
                continue;
            }
        }
        return count;
    }

    public static boolean isNumber(char ch){
        if(ch>='0' && ch<='9'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String string="Are there 1234 any 123 digits in 34 the string 21";
        System.out.println(numbers(string));
    }
}
