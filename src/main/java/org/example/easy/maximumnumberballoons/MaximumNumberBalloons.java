package org.example.easy.maximumnumberballoons;

import java.util.ArrayList;
import java.util.Collections;


public class MaximumNumberBalloons {
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        String checkWord = "balloon";
        int count = 0;
        int first =0;
        int second =0;
        int third =0;
        int fourth =0;
        int fifth =0;
        if (text.length() < checkWord.length()) {
            return 0;
        }
        char[] arrayInputText = text.toCharArray();
        for (char ars: arrayInputText) {
            switch (ars){
                case 'b' -> first++;
                case 'a' -> second++;
                case 'l' -> third++;
                case 'o' -> fourth++;
                case 'n' -> fifth++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(first);
        arr.add(second);
        arr.add(third/2);
        arr.add(fourth/2);
        arr.add(fifth);
        System.out.println(arr);
        count = Collections.min(arr);
        return count;
    }
}
