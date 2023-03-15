package com.apolis.codewars;
//Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates
//all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.
//
//        Examples:
//
//        encrypt("012345", 1)  =>  "135024"
//        encrypt("012345", 2)  =>  "135024"  ->  "304152"
//        encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"
//
//        encrypt("01234", 1)  =>  "13024"
//        encrypt("01234", 2)  =>  "13024"  ->  "32104"
//        encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
//
//        Together with the encryption function, you should also implement a decryption function which reverses the process.
//
//        If the string S is an empty value or the integer N is not positive, return the first argument without changes.
public class EncryptDecrypt {
    private static String encrypt(final String text,final int n) {
        String copy= text;

        int count=n;
        while(count>0) {
            StringBuilder stringBuilderEven= new StringBuilder();
            StringBuilder stringBuilderOdd= new StringBuilder();
            for (int i = 0; i < copy.length(); i++) {
                if (i % 2 == 0) {
                    stringBuilderEven.append(copy.charAt(i));
                } else {
                    stringBuilderOdd.append(copy.charAt(i));
                }
            }

            copy=String.valueOf(stringBuilderOdd.append(stringBuilderEven));
            System.out.println(" encrypt :"+copy);
            count--;
        }
        return copy;
    }
//private static String decrypt(final String text, final int n) {
//	String copy= text;
//
//	int count=n;
//	while(count>0) {
//        StringBuilder stringBuilderEven= new StringBuilder();
//        StringBuilder stringBuilderOdd= new StringBuilder();
//	for (int i=0;i<copy.length();i++){
//		if(i%2==0){
//            stringBuilderEven.append(copy.charAt(i));
//
//		}else {
//
//            stringBuilderOdd.append(copy.charAt(i));
//
//
//        }
//		}
//        System.out.println(stringBuilderEven.toString());
//    System.out.println(stringBuilderOdd.toString());
//
//        copy=String.valueOf(stringBuilderEven.append(stringBuilderOdd));
//
//        System.out.println(" decrypt :"+copy);
//
//        count--;
//	}
//
//	return copy;
private static String decrypt(final String text, final int n) {
    if(text.isEmpty() || text==null || n< 0) return text;
//    System.out.println(text);
    String copy= text;
//    System.out.println(copy);
    int half=copy.length() / 2;
//    if(copy.length()%2==0) {
//         half = copy.length() / 2;
//    }
//    else {
//         half= copy.length()/2+1;
//    }
    int count=n;
    while(count>0) {
        StringBuilder stringBuilder= new StringBuilder();

    for (int i=0;i<half;i++){
        if(i<half-1) {
            stringBuilder.append(copy.charAt(i + half));
            stringBuilder.append(copy.charAt(i));
        }else {
            stringBuilder.append(copy.charAt(i));
        }
    }
         copy= stringBuilder.toString();
        System.out.println("decrypt function:" +copy);
        count--;
    }

return copy;
}
    public static void main(String[] args) {
        String text= "012345";

        int n=3;
        System.out.println(encrypt(text,n));
        System.out.println(decrypt(text,n));
        System.out.println(encrypt("This is a test!",1));
        System.out.println(decrypt("hsi  etTi sats!",1));
        System.out.println(decrypt("Tsa h iestt!s",1));

    }
}
