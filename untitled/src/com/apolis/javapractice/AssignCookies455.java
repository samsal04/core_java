package com.apolis.javapractice;
//Assume you are an awesome parent and want to give your children some cookies.
//But, you should give each child at most one cookie.
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
//and each cookie j has a size s[j]. If s[j] >= g[i],
//we can assign the cookie j to the child i, and the child i will be content.
//Your goal is to maximize the number of your content children and output the maximum number.
//
//        Example 1:
//        Input: g = [1,2,3], s = [1,1]
//        Output: 1
//        Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
//        And even though you have 2 cookies, since their size is both 1,
//        you could only make the child whose greed factor is 1 content.
//        You need to output 1.
//
//        Example 2:
//        Input: g = [1,2], s = [1,2,3]
//        Output: 2
//        Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
//        You have 3 cookies and their sizes are big enough to gratify all of the children,
//        You need to output 2.

import java.util.*;

public class AssignCookies455 {
    private static int findContentChildren(int[] children, int[] cookies) {
        int content=0;
        int holder=0;
//        HashMap<Integer,Integer> childMap= new HashMap<>();
//        for(int i=0;i<children.length && i<cookies.length;i++){
//
//
//            if(children[i]==cookies[i]){
//                content++;
//            }
//        }

        List<Integer> childList= new ArrayList<>();

        for (int child:children){
            childList.add(child);
        }

        for(int cookie: cookies){

            if(childList.contains(cookie)){
                holder=childList.indexOf(cookie);
                childList.remove(holder);
                content++;
            }else {
                continue;
            }

        }

//        for (int child: children){
//
//            childMap.compute(child,(key,value)->(value==null)?1:value+1);
//
//        }
//        for(int cookie:cookies){
//
//            if(childMap.containsKey(cookie) && childMap.get(cookie)>0){
////                holder=childMap.get(cookie);
////                holder--;
//                childMap.put(cookie,childMap.get(cookie)-1);
//                content++;
//            }else {
//                continue;
//            }
//
//        }
        return content;
//
//        Arrays.sort(g);
//        System.out.println(Arrays.toString(g));
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
//
//        int i = 0;
//        int j = 0;
//        int count = 0;
//
//        while(i < g.length && j < s.length) {
//            if(g[i] > s[j]) {
//                j++;
//            }
//            else if(g[i] == s[j] || s[j] > g[i]) {
//                i++;
//                j++;
//                count += 1;
//            }
//        }
//
//        return count;
    }

    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s= {3};

        System.out.println(findContentChildren(g,s));
    }
}
