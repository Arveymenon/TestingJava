package ModifiedBinaryTreeSearch;

public class CeilingOfANumber {
    public CeilingOfANumber(){
        int[] input = new int[]{1,3,8,10,15};
        System.out.println(getCeil(0, input.length - 1, 12, input));
    }

    public int getCeil(int start, int end, int key, int[] arr){
        if(start <= end){
            int middle = start + ((end - start) / 2);
    
            if(arr[start] == key)
                return start;
            if(arr[end] == key)
                return end;
            if(arr[start] < key && arr[start+1] > key)
                return end;
    
            if(arr[middle] <= key){
                return getCeil(middle,end, key, arr);
            }else {
                return getCeil(start, middle, key, arr);
            }
        }
        return -1;
    }
}


// key == start
// key == end
// key > start && start == end - 1
