package com.example;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        // anagram
        String s = "a bc#";
        String s1 = "bca    ";

        boolean isAnagram = isAnagramCheck(s, s1);
        System.out.println(isAnagram);

        boolean isPlindrom = ispalindrom(s);

        System.out.println(isPlindrom);

    }

    private static boolean ispalindrom(String s) {



        return true;
       
    }

    private static boolean isAnagramCheck(String a, String b) {

        if (a.replaceAll("[\\W]", "").length() == b.trim().length()) {

            char[] arr1 = a.replaceAll("[\\W]", "").toLowerCase().trim().toCharArray();
            char[] arr2 = b.toLowerCase().trim().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);

        } else {
            return false;
        }

    }

}
