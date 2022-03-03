package TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPoints {
    public KClosestPoints(){
        int[][] arr = new int[][] {
            new int[]{1, 2},
            new int[]{1, 3}
        };
        int K = 1;
        // 0 -> index
        // 1 -> distance
        Queue<Double[]> Pqueue = new PriorityQueue<>(
            (a,b) -> { return Double(a[1] - b[1]); }
        );

        for(int i = 0; i < arr.length; i++){
            Double value = Math.sqrt(Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2));
            Double index = i;
            if(i < K){
                Pqueue.add(new Double[]{
                    index, value
                });
            }
        }

    }
}
