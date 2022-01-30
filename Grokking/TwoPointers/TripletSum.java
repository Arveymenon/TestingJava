package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

    List<int[]> output = new ArrayList<>();
    int[] arr = new int[]{-5, 2, -1, -2, 3};

    public TripletSum(){
        Arrays.sort(this.arr);
        System.out.println(Arrays.toString(arr));

        for(int index = 0; index < arr.length; index++)
            if(index == 0 || arr[index] != arr[index - 1])
               this.getTripletFor(index);
        
        for(int[] triplet: this.output){
            System.out.println(Arrays.toString(triplet));
        }
    }

    public void getTripletFor(int index) {
        int start = index + 1, end = this.arr.length - 1;
        int currentSum = -this.arr[index];
        while(start < end){
            int targetSum = this.arr[start] + this.arr[end];
            if(targetSum == currentSum){
                this.output.add(new int[]{-currentSum, this.arr[start], this.arr[end]});
                start++;
                end--;
            } else if(targetSum < currentSum && start != 0){
                start++; 
                while(this.arr[start] == this.arr[start + 1]) start++; 
            }
            else {
                end--;
                while(this.arr[end] == this.arr[end - 1] && end != this.arr.length - 1) end--; 
            }
                
        }
    }
}