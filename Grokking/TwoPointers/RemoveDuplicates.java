package TwoPointers;

public class RemoveDuplicates {
 
    public RemoveDuplicates(){
        int[] arr = {3, 2, 3, 6, 3, 10, 9, 3};
        int start = 0, end = 0, sizeCount = 0;
    
        while(end < arr.length){
            if(end == 0 || arr[end] != arr[start]){
                start = end;
                sizeCount++;
            }
            end++;
        }

        System.out.println(sizeCount);
    }

    public RemoveDuplicates(int key){
        int[] arr = {2, 11, 2, 2, 1};
        int end = 0, count = 0;
        while(end != arr.length){
            if(arr[end] == key){
                count++;
            }
            end++;
        }
        System.out.println(arr.length-count);
    }
}