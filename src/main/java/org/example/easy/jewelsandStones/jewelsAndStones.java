package org.example.easy.jewelsandStones;

import java.util.Objects;

public class jewelsAndStones {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels,stones));
    }
        public static int numJewelsInStones(String jewels, String stones) {
            int counter = 0;
            char[] jews = jewels.toCharArray();
            char[] stons = stones.toCharArray();
            for (char jew : jews) {
                for (char ston : stons) {
                    if (Objects.equals(jew, ston)) {
                        counter++;
                    }

                }


            }
            return counter;
        }

}
