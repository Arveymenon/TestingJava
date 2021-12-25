import java.lang.reflect.Constructor;

public class MaximumSubArrayOfSize {

    private int[] arr = new int[]  {1, 3, 2, 6, -1, 4, 1, 8, 2};
    int K = 3;

    MaximumSubArrayOfSize(){
        int windowStart = 0;
        int windowEnd = 0;

        int g_max = 0;
        int c_max = 0;

        while(windowStart < arr.length){
            c_max += arr[windowStart];
            g_max = c_max > g_max ? c_max : g_max;
            
            windowStart++;
            if(windowStart - windowEnd >= K){
                c_max -= arr[windowEnd];
                windowEnd++;
            }
        }

        System.out.println(g_max);
    }


}
