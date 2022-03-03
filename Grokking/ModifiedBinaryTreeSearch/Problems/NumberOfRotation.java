package ModifiedBinaryTreeSearch.Problems;

public class NumberOfRotation {
    public NumberOfRotation(){
        int arr[] = new int[] {1, 3, 8, 10};
        System.out.println(getRotations(arr));
    }
    
    public int getRotations(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + ((end - start)/2);

            if(arr[mid] > arr[mid + 1])
                return mid + 1;
            if(arr[mid] < arr[mid - 1])
                return mid;

            if(arr[start] < arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
