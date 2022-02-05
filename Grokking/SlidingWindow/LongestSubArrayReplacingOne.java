package SlidingWindow;

public class LongestSubArrayReplacingOne {

    public LongestSubArrayReplacingOne(){
        int arr[] = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 3;

        int start = 0, end = 0, maxCount = 0, maxLength = 0;
        while (end != arr.length){
            
            if(arr[end] == 1){
                maxCount++;
            }

            int windowSize = end - start + 1;
            if(windowSize - maxCount > k){
                if(arr[start] == 1){
                    maxCount--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        
        System.out.println(maxLength);
    }
}
