package ModifiedBinaryTreeSearch;

public class OrderAgnosticBinarySearch {
    public OrderAgnosticBinarySearch(){
        int[] input = new int[]{4,6,10};
        int key = 10;
        int start = 0, end = input.length - 1;
        int output = binarySearch(start, end, input, key);
        System.out.println(output);

    }

    public int binarySearch(int start, int end, int[] arr, int key){
        if(start <= end){
            int middle = start + ((end - start)/2);
            if(arr[start] == key)
                return start;
            if(arr[end] == key)
                return end;

            int left = binarySearch(start+1, middle, arr, key);
            int right = binarySearch(middle,end-1, arr, key);
            if (left > -1) return left;
            if (right > -1) return right;
        }
        return -1;
    }
}
