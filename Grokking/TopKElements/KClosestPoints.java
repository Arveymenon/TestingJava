package TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPoints {
    public KClosestPoints(){
        int[][] arr = new int[][] {
            new int[]{1, 3},
            new int[]{3, 4},
            new int[]{2, -1},
        };
        int K = 2;
        // 0 -> index
        // 1 -> distance
        Queue<Double[]> Pqueue = new PriorityQueue<>(
            (a,b) -> {
                return Double.compare(b[1],a[1]);
            }
        );

        for(int i = 0; i < arr.length; i++){
            Double value = Math.sqrt(Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2));
            Double index = (double) i;
            if(i < K){
                Pqueue.add(new Double[]{
                    index, value
                });
            } else if(Pqueue.peek()[1] > value){
                Pqueue.remove();
                Pqueue.add(new Double[]{
                    index, value
                });
            }
        }
        Pqueue.forEach((action)->{
            System.out.println(action[0]);
        });

    }
}