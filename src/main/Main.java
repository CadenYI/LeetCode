package src.main;

import src.module.TwoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int[] result = TwoSum.twoSum(nums, 18);
        System.out.println(result[0] + ", " + result[1]);
    }
}
