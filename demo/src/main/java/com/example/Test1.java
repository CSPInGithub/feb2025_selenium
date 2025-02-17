package com.example;

public class Test1 {

    public static void main(String[] args) {
        String str = "Developer";

        int strLength= str.length();

        System.out.println(strLength);

        //remove forst and last char

        System.out.println(str.substring(1, strLength-1));
       
        
    }

}
