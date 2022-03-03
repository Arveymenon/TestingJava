package TopKElements;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestNumber {
    public KthSmallestNumber(){
        int[] arr = new int[] {5, 12, 11, -1, 12};
        int K = 3;
        int start = 0;
        Queue<Integer> Pqueue = new PriorityQueue<>(Comparator.reverseOrder());
        while(start < arr.length){
            if(start < K)
                Pqueue.add(arr[start]);
            else if(arr[start] < Pqueue.peek()){
                Pqueue.remove();
                Pqueue.add(arr[start]);
            }
            start++;
        }
        System.out.println(Pqueue.remove());
    }
}
