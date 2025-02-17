package com.feb07;

public class FirstOccurrence {

    public static void main(String[] args) {

        String s = "autotestamtion testing";
        String sub = "test";
        // find all occurences of sub

        int index = s.indexOf(sub);
        //System.out.println(index);// 4

        while (index != -1) {
            System.out.println(sub + " found at: " + index);
            index = s.indexOf(sub, index + 1);// 15

        }

    }
}
