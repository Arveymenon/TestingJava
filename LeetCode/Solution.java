
class Solution {
    int output = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        
        getSum(nums, 0, nums[0], 0);
        return this.output == Integer.MAX_VALUE ? 0 : this.output;
    }
    
    void getSum(int[] nums, int index, int jumps, int count){
        if((index >= nums.length-1)) return;
            
        int i = jumps;
        while (i > 0) {
            if(index + i < nums.length){
                getSum(nums, index + i, nums[index + i], count+1);
                if(index + i == nums.length - 1){
                    this.output = Math.min(this.output, count+1);
                }
            }
            i--;
        }
    }

    public static void main(String[] args) {
        System.out.println( new Solution().jump(new int[]{ 1, 2, 0, 1 }));
    }
}