package ModifiedBinaryTreeSearch.SearchInSortedInfiniteArray;

public class SearchInInfiniteArray {
    public SearchInInfiniteArray(){
        int key = 200;
        ArrayReader reader = new ArrayReader();
        int slow = 0, fast = 1;

        while(reader.get(fast) < key){
            slow = fast;
            fast *= 2;
        }
        System.out.println(slow+", "+fast);
        int op = -1;
        while(slow <= fast){
            int mid = slow + ((fast - slow)/2);
            if(reader.get(mid) < key){
                slow = mid + 1;
            } else if(reader.get(mid) > key){
                fast = mid - 1;
            } else {
                // slow = slow - 1;
                op = mid;
                fast = slow - 1;
            }
        }
        System.out.println(op);
    }
}
