package org.example.easy.anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "anagram";
        String second = "nagaram";
        System.out.println(check(first, second));

    }

    public static boolean check(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        int counter = 0;
        boolean check = false;
        if (first.length == second.length) {
            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    counter++;
                    if (counter == first.length) {
                        check = true;
                        break;
                    }
                }
            }


        }
        return check;
    }
}