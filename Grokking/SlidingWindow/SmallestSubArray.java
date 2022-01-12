package SlidingWindow;
public class SmallestSubArray {
    int[] arr = new int[] {2, 1, 5, 2, 3, 2};
    int K = 7;

    public SmallestSubArray(){
        int start = 1000000, end = 0;
        int c_start = 0, c_end = 0, c_sum = 0;

        while(c_start < arr.length) {
            c_sum += arr[c_start];
            
            while(c_sum >= K){
                if(c_sum - arr[c_end] > K){
                    c_sum = c_sum - arr[c_end];
                    c_end++;
                }else{
                    if((start - end) > (c_start - c_end)){
                        start = c_start;
                        end = c_end;
                        c_sum -= arr[c_end];
                        c_end++;
                    }
                    break;
                }
            }
            c_start++;
        }

        System.out.println(start+"   "+ end);
        System.out.println(start - end);

        System.out.println(c_start+"   "+ c_end);
        System.out.println(c_start - c_end);
    }
}