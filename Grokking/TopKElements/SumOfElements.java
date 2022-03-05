package TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class SumOfElements {
    public SumOfElements(){
        int[] arr = new int[] {1, 3, 12, 5, 15, 11};
        int k1 = 3, k2 = 6, op = 0;

        Queue<Integer> pqueue = new PriorityQueue<>();
        
        for(int val: arr){
            pqueue.add(val);
        }
        int i = 1;
        while(i < arr.length && i < k2){
            int num = pqueue.poll();
            if(i > k1){
                op += num;
            }
            i++;
        }
        System.out.println(op);
    }
}
