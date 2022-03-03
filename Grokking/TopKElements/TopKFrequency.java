package TopKElements;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequency {
    public TopKFrequency(){
        int[] arr = new int[] {5, 12, 11, 3, 11};
        // int[] arr = new int[] {1, 3, 5, 12, 11, 12, 11};
        int k = 2;
        // value, frequency
        HashMap<Integer, Integer> list = new HashMap<>();
        Queue<Numbers> minHeap = new PriorityQueue<>(
            (a,b)->{
                return a.frequency - b.frequency;
            }
        );
        
        for(int i = 0; i < arr.length; i++){
            list.put(arr[i], list.getOrDefault(arr[i], 0) + 1);
        }
        list.forEach((key, freq)->{
            minHeap.add(
                new Numbers(key, freq)
            );
            if(minHeap.size() > k){
                minHeap.poll();
            }
        });

        minHeap.forEach(action->{
            System.out.println(action.value);
        });

    }
}

class Numbers{
    int value;
    int frequency;
    Numbers(int value, int frequency){
        this.value = value;
        this.frequency = frequency;
    }
}