package org.example.easy.palindrome;

import java.util.LinkedList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
        isPalindrome("race a car");

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        ;
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        List<String> list = new LinkedList<>();
        list.add(s);
        list.add(rev);
        System.out.println(s.contains(rev));
        return s.contains(rev);
    }
}

