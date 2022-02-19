package TwoHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianOfNumberStream {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    void insertNumber(int num){
        if(maxHeap.isEmpty() || minHeap.isEmpty()) maxHeap.add(num);
        else if(num < maxHeap.peek()) maxHeap.add(num);
        else minHeap.add(num);
        
        this.rebalance();
    }
    
    void rebalance(){
        if(maxHeap.size() == minHeap.size()) return;
        if(minHeap.size() > maxHeap.size()){ maxHeap.add(minHeap.poll()); }
        if(minHeap.size() < maxHeap.size()){ minHeap.add(maxHeap.poll()); }
    }
    
    float getMedian(){
        if(maxHeap.size() == minHeap.size()){
            return (float) (maxHeap.peek() + minHeap.peek())  / 2;
        }
        return maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
    }
    
    public FindMedianOfNumberStream(){
        this.insertNumber(3);
        this.insertNumber(1);
        System.out.println(this.getMedian());
        this.insertNumber(5);
        System.out.println(this.getMedian());
        this.insertNumber(4);
        System.out.println(this.getMedian());
    }

}
