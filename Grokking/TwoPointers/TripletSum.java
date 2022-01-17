package TwoPointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TripletSum {

    List<int[]> output = new ArrayList<>();

    public TripletSum(){
        int[] arr = {-3, 0, 1, 2, -1, 1, -2};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
            // if(!set.contains(arr[i])){
                // getTargetSum(arr, -arr[i]);
            // }
        }
        System.out.println(set);
    }

    // public List<int[]> getTargetSum(int[] arr, int targetSum){

    //     int start = 0, end = arr.length - 1;
    //     while(end > start){
    //         if(arr[start] + arr[end] == targetSum){
    //             int[] triple = {arr[start], arr[end], targetSum};
    //             output.add(triple);
    //         }
    //     }
    //     return this.output;
    // }
}
