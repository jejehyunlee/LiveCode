package org.jeje.leetcode;

import java.util.Arrays;

/*
Created By IntelliJ IDEA 2025.1.2 (Ultimate Edition)
Build #IU-251.26094.121, built on June 3, 2025
@Author JEJE a.k.a Jefri S
Java Developer
Created On 8/6/2025 2:40 PM
@Last Modified 8/6/2025 2:40 PM
Version 1.0
*/
public class CountOfBasketsFruits {

    public static void main(String[] args) {

        int[] baskets = new int[]{4,2,5};
        int[] fruits = new int[]{3,5,4};

        countBaskets(baskets, fruits);

    }

    public static void countBaskets(int[] baskets, int[] fruits) {

        Arrays.sort(baskets);
        Arrays.sort(fruits);

        int basketIndex = 0;
        int unPlaced = 0;


        unPlaced = getUnPlaced(baskets, fruits, basketIndex, unPlaced);

        System.out.println("Buah yang tidak kebagian sebanyak " + unPlaced + " buah");
    }

    private static int getUnPlaced(int[] baskets, int[] fruits, int basketIndex, int unPlaced) {
        for (int fruit : fruits){
            while (basketIndex < baskets.length && baskets[basketIndex] <= fruit){
                basketIndex++;
            }

            if (basketIndex < baskets.length){
                basketIndex++;
            } else {
                unPlaced++;
            }
        }
        return unPlaced;
    }

}
