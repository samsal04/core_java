package com.apolis.javapractice;
//You are given a string s and an array of strings words. All the strings of words are of the same length.
//
//        A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
//        For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings.
//        "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.

public class ConcatPermutations {
//    private static String[] list(String[] array) {
//
//        String[] permutation= new String[permutation(array.length)];
//        int count=0;
//        while(count<= permutation(array.length)){
//
//
//
//
//
//        }
//
//        return null;
//
//    }
//
//    private static int permutation(int length){
//        if(length==1){
//            return 1;
//        }
//        else {
//            return length * (permutation(length - 1));
//        }
//    }
//    public static void main(String[] args) {
//        String[] array= {"ab","cd","ef"};
//
//        System.out.println(list(array));
//    }
//
//
//}

    public static int min(int x, int y)
    {
        return (x < y) ? x : y;
    }

    // Utility function for calculating
// Minimum element to delete
    public static int utility_fun_for_del(String string,int first, int last)
    {
        if (first >= last)
            return 0;
        // Condition to compare characters
        if (string.charAt(first) == string.charAt(last))
        {   // Recursive function call
            return utility_fun_for_del(string,first + 1, last - 1);
        }
        // Return value, incrementing by 1
        return 1 + Math.min(utility_fun_for_del(string, first + 1, last),utility_fun_for_del(string, first, last - 1));
    }
    // Function to calculate the minimum
// Element required to delete for
// Making string palindrome
    public static int min_ele_del(String string)
    {
        // Utility function call
        return utility_fun_for_del(string, 0,string.length() - 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "abefbac";

        System.out.println("Minimum element of deletions = " +
                min_ele_del(str));
    }
}
