package TopKElements;

import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestNumbers {
    public KClosestNumbers(){
        int[] arr = new int[] {5,6,7,8,9};
        int K = 3, X = 7;

        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->{
            return b.getValue() - a.getValue();
        });

        for(int num: arr){
            maxHeap.add(Map.entry(num, Math.abs(X - num)));
            if(maxHeap.size() > K){
                maxHeap.remove();
            }
        }
        System.out.println(new ArrayList<>(maxHeap));
    }
}