package TwoPointers;

import java.util.Arrays;

public class ClosestTriplet {

    public ClosestTriplet(){
        System.out.println(this.threeSumClosest(
                new int[] {-1, 1, 3, 1, -1}, -1)
            );
    }

    public int threeSumClosest(int[] nums, int target) {
        int closest = 1001;
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int currentClosest = this.closestWith(nums, target, i);
            closest = Math.abs(target - currentClosest) > Math.abs(target - closest) ? closest : currentClosest;
        }
        return closest;
    }
    
    public int closestWith(int[] nums, int target, int index){
        //  RULE: closest = closest > target - index - i - j ? index + i + j : closest
        int closest = 1001;
        
        int i = index + 1, j = nums.length - 1;
        
        while(i < j){
            int currentTotal = nums[index] + nums[i] + nums[j];
            System.out.println(Math.abs((target - closest)) + "__" + Math.abs((target - currentTotal)));
            closest = Math.abs(target - closest) > Math.abs(target - currentTotal) ? currentTotal : closest;
            
            if(target < currentTotal){
                j--;
            }else if(target > currentTotal){
                i++;
            }else {
                return target;   
            }
        }
        
        return closest;
    }
}
