package com.apolis.corejava.ImmutableClass;

public class TestImmutableString {
    public static void main(String[] args) {

        String s= "java" ;  ///   a reference is created at imagine : 1010

        s.concat("script");   // with "script" another reference was created at 1020
        // so when concatenation happened, it appended newly created object and not the original

        System.out.println(s);


        // let's say 5 references using this password
        // now if we changed value for any of those it may change the value of all 5. Therefore, string is immutable
        String password="pwd";
        password.concat("123");

        StringBuffer stringBuffer =  new StringBuffer("java");
        stringBuffer.append("script");
        System.out.println(stringBuffer);

    }
}
