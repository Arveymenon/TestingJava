package TopKElements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectRopes {
    
    public ConnectRopes(){
        int[] arr = new int[] {1, 3, 11, 5, 2};
        Queue<Integer> Pqueue = new PriorityQueue<>();
        List<Integer> op = new ArrayList<>();

        for(int i = 0; i < arr.length; i ++)
            Pqueue.add(arr[i]);

        while(Pqueue.size() != 1){
            int value = Pqueue.poll() + Pqueue.poll();
            Pqueue.add(value);
            op.add(value);
        }
        for(int i = 1; i < op.size(); i++){
            op.set(0, op.get(0) + op.get(i));
        }
        System.out.println(op.get(0));
    }
}