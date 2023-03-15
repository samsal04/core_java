package com.apolis.practicecodes;
//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//Use conditionals to return the proper message:
//
//        case 	return
//        name equals owner 	'Hello boss'
//        otherwise 	'Hello guest'
public class PersonalisedMessage {
    private static String greet(String name, String owner) {

       return  (owner.equals(name))?"Hello boss":"Hello guest";
    }
    public static void main(String[] args) {
        String name="Greg";
        String owner="Daniel";
        System.out.println(greet(name,owner));
    }
}
