package MergeKSortedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSorted {
    public MergeKSorted(){
        List<Integer> L1 = new ArrayList<>(Arrays.asList(2,6,8));
        List<Integer> L2 = new ArrayList<>(Arrays.asList(3,6,7));
        List<Integer> L3 = new ArrayList<>(Arrays.asList(1,3,4));
        
        SortWith sortWith = new SortWith();
        sortWith.addList(L1);
        sortWith.addList(L2);
        sortWith.addList(L3);

        sortWith.printList();
    }
}

class SortWith{
    Queue<Integer> minHeap = new PriorityQueue<>((a,b)->{
        return a - b;
    });
    
    SortWith(){}

    void addList(List<Integer> arr){
        minHeap.addAll(arr);
    }
    
    void printList(){
        while(!minHeap.isEmpty())
            System.out.println(minHeap.poll());
    }
}
