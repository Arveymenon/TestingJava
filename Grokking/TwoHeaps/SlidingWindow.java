package TwoHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public SlidingWindow(){
        int[] input = new int[] {1,2,-1,3,5};
        int K = 3; // window size
        
        float[] output = new float[input.length - (K - 1)];
        int start = 0, end = 0;
        while(end < input.length){

            if((maxHeap.isEmpty() || minHeap.isEmpty()) || input[end] > maxHeap.peek()) maxHeap.add(input[end]);
            else minHeap.add(input[end]);

            if(maxHeap.size() > minHeap.size()) minHeap.add(maxHeap.poll());
            if(maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll());

            if(end >= (K - 1)){

                if(K%2 == 0){
                    output[start] = (float)(maxHeap.peek() + minHeap.peek()) / 2;
                }else{
                    output[start] = maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
                }
                if(input[start] < maxHeap.peek()){
                    maxHeap.remove(input[start]);
                } else{
                    minHeap.remove(input[start]);
                }
                
                start++;
            }
            end++;
        }
        for(float i: output){
            System.out.println(i);
        }
    }
}
