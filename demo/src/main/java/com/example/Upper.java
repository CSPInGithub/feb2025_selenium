package com.example;

public class Upper {

    public static void main(String[] args) {

        String input = "Hello, World!";
        String output = convertToUpperCase(input);
        System.out.println(output);

    }

    private static String convertToUpperCase(String input) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {

                Character a = Character.toUpperCase(input.charAt(i));
                sb.append(a);

            } else {
                sb.append(input.charAt(i));
            }

        }

        return sb.toString();

    }

}
