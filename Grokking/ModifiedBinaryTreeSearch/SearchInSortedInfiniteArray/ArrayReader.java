package ModifiedBinaryTreeSearch.SearchInSortedInfiniteArray;

public class ArrayReader {
    int arr[] = new int[] {1, 3, 8, 10, 15};

    public ArrayReader(){}
    int get(int i){
        if(i < arr.length){
            return arr[i];
        }
        return Integer.MAX_VALUE;
    }
}
