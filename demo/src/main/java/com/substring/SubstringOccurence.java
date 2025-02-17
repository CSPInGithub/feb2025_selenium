package com.substring;

public class SubstringOccurence {

    public static void main(String[] args) {

        String text = "abcabcabc";
        String sub = "abc";

        System.out.println(findOccurence(text, sub));

    }

    private static int findOccurence(String text, String sub) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {

                if (text.substring(i, j).equals(sub)) {
                    count++;
                }
            }
        }

        return count;

    }

}
