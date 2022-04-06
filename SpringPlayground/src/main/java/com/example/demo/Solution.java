package com.example.demo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int @NotNull [] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums.length < 4) return output;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3;i++){

            for(int j = i+1; j < nums.length - 2; j++){

                int k = j + 1;
                int l = nums.length - 1;

                while(k<l){
                    int currentSum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(currentSum > target){
                        l--;
                    } else if(currentSum < target){
                        k++;
                    } else {
                        List<Integer> op = new ArrayList<>();
                        op.add(nums[i]);
                        op.add(nums[j]);
                        op.add(nums[k]);
                        op.add(nums[l]);
                        output.add(op);
                        k++;
                    }
                }
            }
        }

        return output;
    }
}