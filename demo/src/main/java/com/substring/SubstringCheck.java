package com.substring;

public class SubstringCheck {

    public static void main(String[] args) {

        String str1 = "automation";
        String str2 = "a";

        System.out.println(isFound(str1, str2));

    }

    private static boolean isFound(String str1, String str2) {
        boolean found = false;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {

                if (str1.substring(i, j).equals(str2)) {
                    found = true;
                    break;
                }

            }
        }
        return found;
    }

}
