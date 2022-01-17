package TwoPointers;

public class PairOfTargetSum {
    
    public PairOfTargetSum(){
        int arr[] = {1, 2, 3, 4, 6};
        int target = 6;
        
        int start = 0, end = arr.length - 1;

        while(start != end){
            if(arr[start] + arr[end] < target){
                start++;
                continue;
            }
            if(arr[start] + arr[end] > target){
                end--;
                continue;
            }
            break;
        }
        System.out.println(start+" , "+end);
    }

}