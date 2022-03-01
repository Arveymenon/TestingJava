package ModifiedBinaryTreeSearch.Problems;

public class FindBitonic {
    public FindBitonic(){
        // int[] arr = new int[] {1, 3, 8, 4, 3};
        // int[] arr = new int[] {3,8,3,1};
        int[] arr = new int[] {1, 3, 8, 12};
        // int[] arr = new int[] {10,9,8};
        int k = 1;
        int maxIndex = findMaxIndex(arr);

        int left = this.searchForKeyInBitonic(arr, k, 0, maxIndex);
        int right = this.searchForKeyInBitonic(arr, k, maxIndex + 1, arr.length - 1);
        if(left > right){
            System.out.println(left);
        } else if(left < right){
            System.out.println(right);
        } else {
            System.out.println(-1);
        }
    }

    public int searchForKeyInBitonic(int[] arr, int key, int start, int end){

        while(start <= end){
            if(arr[start] == key)return start;
            if(start == end) return -1;
                
            int mid = start + ((end - start)/2);
            if((arr[mid] < arr[mid+1] && arr[mid] < key) ||
                (arr[mid] > arr[mid+1] && arr[mid] > key)){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    int findMaxIndex(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}