package org.jeje.leetcode;

/*
Created By IntelliJ IDEA 2025.1.2 (Ultimate Edition)
Build #IU-251.26094.121, built on June 3, 2025
@Author JEJE a.k.a Jefri S
Java Developer
Created On 8/6/2025 2:30 PM
@Last Modified 8/6/2025 2:30 PM
Version 1.0
*/
public class TwoSum {

    public static void main(String[] args) {

        solveTwoSum(new int[]{2, 7, 11, 15}, 9);

        solveTwoSum(new int[]{3, 2, 4}, 6);

    }


    public static void solveTwoSum(int[] nums, int target ) {
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if (sum == target){
                    System.out.println("index ke -" + i + " adalah " + nums[i] + " & index ke -" + j + " adalah " + nums[i] + " = " + sum);
                    System.out.println("sama dengan target " + target);
                }
            }
        }
    }
}
