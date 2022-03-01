package ModifiedBinaryTreeSearch;

public class Bitonic {

    public Bitonic(){
        int[] arr = new int[] {3, 8, 3, 1};
        System.out.println(getMaxOfBitonic(arr, 0, arr.length - 1));
    }

    int getMaxOfBitonic(int[] arr, int start, int end) {
        if(start < end){
            int mid = start + ((end - start)/2);
            int left = getMaxOfBitonic(arr, start, mid);
            int right = getMaxOfBitonic(arr, mid + 1, end);

            if(left > right)
                return left;
            return right;
        }
        return arr[start];
    }
    
}


// REDO and understand the question better