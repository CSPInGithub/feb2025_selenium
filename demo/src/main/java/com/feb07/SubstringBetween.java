package com.feb07;

public class SubstringBetween {

    public static void main(String[] args) {

        String text = "Hello [important] World";

        System.out.println(text.substring(1,2));
        // String strt = "[";
        // String end = "]";

        // String result = extract(text, strt, end);
        // System.out.println(result);
    }

    // private static String extract(String text, String strt, String end) {

    //     int index_strt = text.indexOf(strt);
    //     int index_end = text.indexOf(end, index_strt + 1);
    //     System.out.println(index_strt + "&" + index_end);

    //     String result = text.substring(index_strt + 1, index_end);

    //     return result;
    // }

}
