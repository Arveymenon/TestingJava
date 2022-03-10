package MergeKSortedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestOfSortedMatrix {
    public KthSmallestOfSortedMatrix(){
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(2, 6, 8)),
            new ArrayList<>(Arrays.asList(3, 7, 10)),
            new ArrayList<>(Arrays.asList(5 ,8, 11))
        ));
        int k = 5;

        Queue<List<Integer>> minHeap = new PriorityQueue<>((prev, next)->{
            return prev.get(0) - next.get(0);
        });
        for(List<Integer> list: matrix){
            minHeap.add(list);
        }

        int i = 0;
        while(i < k - 1){
            List<Integer> list = minHeap.poll();
            if(list.size() > 0){
                list.remove(0);
                minHeap.add(list);
            }
            i++;
        }

        System.out.println(minHeap.poll().get(0));
    }
}