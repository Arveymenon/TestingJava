package TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class TopKNumber {
    public TopKNumber(){
        int[] arr = new int[] {3, 1, 5, 12, 2, 11};
        int K = 3;
        int start = 0;
        Queue<Integer> Pqueue = new PriorityQueue<>();
        while(start < arr.length){
            if(start < K)
                Pqueue.add(arr[start]);
            else if(arr[start] > Pqueue.peek()){
                Pqueue.remove();
                Pqueue.add(arr[start]);
            }
            start++;
        }
        for(int i = 0; i < K; i++)
            System.out.println(Pqueue.poll());
    }
}
