package ModifiedBinaryTreeSearch.Problems;

public class SearchInRotatedArray {
    public SearchInRotatedArray(){
        int[] arr = new int[]{4, 5, 7, 9, 10, -1, 2};
        int key = 10;
        int midMax = getRotationPoint(arr);
        int op = searchInAscArr(arr, key, 0, midMax);
        if(key < arr[arr.length - 1] && op == -1){
            op = searchInAscArr(arr, key, midMax+1, arr.length - 1);
        }
        System.out.println(op);
    }

    int getRotationPoint(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end && arr[start] < arr[start + 1]){
            start++;
        }
        return start;
    }

    int searchInAscArr(int[] arr, int key, int start, int end){

        while(start <= end){
            int mid = start + ((end- start)/2);
            if(arr[mid] < key){
                start = mid + 1;
            } else if(arr[mid] > key){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }    
}
