package TwoHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximizeCapital {
    public MaximizeCapital(){

        int[] project_cap = new int[] {0,1,2,3};
        int[] project_prof = new int[] {1,2,3,5};
        int InitialCap = 1;
        int NumberOfProjects = 2;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int val: project_cap){
            if(val <= InitialCap)
                maxHeap.add(val);  
            else minHeap.add(val);
        }
        int k = 0;
        while(k < NumberOfProjects){
            int value = maxHeap.poll();
            InitialCap += project_prof[value];

            while(minHeap.size() > 0 && minHeap.peek() <= InitialCap){
                maxHeap.add(minHeap.poll());
            }
            k++;
        }
        System.out.println(InitialCap);
    }
}
