package TwoPointers.Problems;

public class Problem3 {
    public Problem3(){
        System.out.println(this.solve(new int[]{1,2,3}));
    }

    int solve(int arr[]){
        int start = 0, end = arr.length - 1;
        int smallestAnomally = arr[end], largestAnomally = arr[start];

        while(start < arr.length - 1){
            if(arr[start] > arr[start + 1] && smallestAnomally > arr[start + 1]){
                smallestAnomally = arr[start + 1];
            }
            
            if(arr[end] < arr[end - 1]  && largestAnomally < arr[end - 1]){
                largestAnomally = arr[end - 1];
            }
            start++;
            end--;
        }

        if(smallestAnomally > largestAnomally){
            return 0;
        }

        int si = 0;
        for(int index = 0; index < arr.length; index++){
            if (smallestAnomally < arr[index]) {
                si = index;
                break;
            }
        }
        int li = arr.length - 1;
        for(int index = arr.length - 1; index > 0; index--){
            if (largestAnomally > arr[index]) {
                li = index;
                break;
            }
        }
        
        return li - si + 1;
    }
}
