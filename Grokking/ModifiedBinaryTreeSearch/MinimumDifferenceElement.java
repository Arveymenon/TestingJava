package ModifiedBinaryTreeSearch;

public class MinimumDifferenceElement {
    public MinimumDifferenceElement(){
        int[] arr = new int[] {4,6,10};
        int k = 4;
        System.out.println(this.findMinDiff(arr, k));
    }
    
    int findMinDiff(int[] arr, int k){  
        int start = 0, end = arr.length - 1;
        if(k < arr[start])
            return arr[start];

        while(start < end && end - start > 1){
            int mid = start + ((end - start)/2);
            if(arr[mid] > k){
                end = mid;
            } else if(arr[mid] < k) {
                start = mid;
            } else {
                return arr[mid];
            }
        }
        if(k - arr[start] <  arr[end] - k)
            return arr[start];
        return arr[end];
    }
}
