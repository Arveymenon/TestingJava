package SlidingWindow;

public class MaximumSubArrayOfSize {

    private int[] arr = new int[]  {2, 1, 5, 2, 3, 2};
    int K = 7;

    public MaximumSubArrayOfSize(){
        int starting = 0;
        int ending = 0;
        int min_length = 99999999;
        int window_sum = 0;

        while(starting != arr.length-1 && ending != arr.length - 1){
            window_sum += arr[ending];
            while( 
                (window_sum > K) && 
                (window_sum - arr[starting] >= K)
            )   {
                    min_length = Math.min(min_length, ending - starting);
                    window_sum -= arr[starting];
                    starting++;
                }
            ending++;
        }
        System.out.println(min_length);
    }
}