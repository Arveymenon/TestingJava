package TwoPointers.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tripletry {
    public Tripletry(){}
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        if(nums.length < 3){
            return new ArrayList();
        }
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int j = i + 1;
                int k = nums.length - 1;
                
                while(j < k){
                    if(nums[j] + nums[k] > -nums[i]){
                        k--;
                        while(k > 0 && (k == nums.length - 1 || nums[k] == nums[k+1])) k--;
                    } else if(nums[j] + nums[k] < -nums[i]){
                        j++;
                        while(j < nums.length - 1 && nums[j] == nums[j-1]) j++;
                        
                    } else {
                        List<Integer> arr = new ArrayList(Arrays.asList(nums[i], nums[j], nums[k]));
                        output.add(arr);
                        j++;
                        while(j < nums.length - 1 && nums[j] == nums[j-1]) j++;
                        k--;
                        while(k > 0 && (k == nums.length - 1 || nums[k] == nums[k+1])) k--;
                    }
                }
            }
        }
        
        return output;
    }
}