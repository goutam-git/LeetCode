package com.company.microsoft.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));

    }

    public static  int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int arr[] = new int[2];
        while(left < right){
            if(nums[left] + nums[right] == target){
               return new int[]{left, right};
            }else if(nums[left] + nums[right] < target){
                left++;
            }else if(nums[left] + nums[right] > target){
                right --;
            }
        }

        return arr;
    }
}
