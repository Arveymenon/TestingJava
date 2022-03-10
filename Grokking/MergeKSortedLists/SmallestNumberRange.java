package MergeKSortedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SmallestNumberRange {
    public SmallestNumberRange(){
        List<List<Integer>> lists = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(1,5,8)),
                new ArrayList<>(Arrays.asList(4, 12)),
                new ArrayList<>(Arrays.asList(7, 8, 10))
            )
        );
        Queue<Integer> minHeap = new PriorityQueue<>((a,b)->{
            return lists.get(a).get(0) - lists.get(b).get(0);
        });
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
            return lists.get(b).get(0) - lists.get(a).get(0);
        });
        for(int i = 0; i < lists.size(); i++){
            minHeap.add(i);
            maxHeap.add(i);
        }

        int[] range = new int[] {0 , Integer.MAX_VALUE};
        while(lists.size() > 0){
            int min = minHeap.peek();
            int max = maxHeap.peek();

            if ((
                (lists.get(max).get(0) - lists.get(min).get(0))
                < range[1] - range[0] && contains(lists, min, max))
                ) {
                    range[0] = lists.get(min).get(0);
                    range[1] = lists.get(max).get(0);
            }

            if(lists.size() > 1)
                lists.get(min).remove(0);
            else
                lists.remove(min);
        }
        System.out.println(range);
    }

    public boolean contains(List<List<Integer>> arr, int min, int max){
        for(int i = 0; i < arr.size(); i++){
            if((i != min && i != max) && 
                !(arr.get(min).get(0) < arr.get(i).get(0) && 
                 arr.get(i).get(0) < arr.get(max).get(0))){
                    return false;
            }
        }
        return true;
    }
}
