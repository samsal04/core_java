package com.apolis.codewars;
//The input is a string str of digits.
//Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).
//If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk;
//otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.
//
//        If
//        sz is <= 0 or if str is empty return ""
//        sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
//
//        Examples:
//        revrot("123456987654", 6) --> "234561876549"
//        revrot("123456987653", 6) --> "234561356789"
//        revrot("66443875", 4) --> "44668753"
//        revrot("66443875", 8) --> "64438756"
//        revrot("664438769", 8) --> "67834466"
//        revrot("123456779", 8) --> "23456771"
//        revrot("", 8) --> ""
//        revrot("123456779", 0) --> ""
//        revrot("563000655734469485", 4) --> "0365065073456944"

public class RevRot {
    private static String revRot(String string, int size) {
        if (string.length()==0 || string.isEmpty()) return "";
        int count=0;
        StringBuilder stringBuilder= new StringBuilder();

            while (count<string.length()){

//            int j= Integer.parseInt(String.valueOf(string.charAt(i)));
//            System.out.println(j);
                String substring = string.substring(count, count + size);
//                System.out.println(substring);
                if(isEven(substring)){
                    System.out.println("reverse : "+substring);
                stringBuilder.append(reverse(substring));
            }else {
                    System.out.println("rotate : "+substring);
                stringBuilder.append( rotate(substring));
            }
            count+=size;

        }

        return stringBuilder.toString();
    }

    private static String rotate(String substring) {

        char  temp=substring.charAt(0);
        StringBuilder stringBuilder= new StringBuilder();

        for(int i=0;i<substring.length();i++){

            if(i<substring.length()-1){
               stringBuilder.append(substring.charAt(i+1));
            }
            else {
               stringBuilder.append(temp);
            }

        }
        System.out.println("rotated : "+stringBuilder.toString());
        return stringBuilder.toString();
    }

    private static String reverse(String substring) {

        StringBuilder stringBuilder= new StringBuilder(substring);

        System.out.println(String.valueOf(stringBuilder.reverse()));
        return String.valueOf(stringBuilder.reverse());
    }

    private static boolean isEven(String substring) {
        int sum=0;
        for (int i=0;i<substring.length();i++){

            sum+=Integer.parseInt(String.valueOf(substring.charAt(i)));

        }
        System.out.println(sum);
        return sum%2==0;
    }

    public static void main(String[] args) {
        String string="123456987654";
        int size=6;

        System.out.println(revRot(string,size));
    }
}
