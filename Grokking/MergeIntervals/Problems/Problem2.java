package MergeIntervals.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem2 {
    
    public Problem2(){
        List<int[]> cpus = new ArrayList<>();
        // assuming it's sorted by the first index;

        cpus.add(new int[]{6, 7, 10});
        cpus.add(new int[]{2, 4, 11});
        cpus.add(new int[]{8, 12, 15});

        System.out.println(this.getMaxLoad(cpus));
    }
    
    public int getMaxLoad(List<int[]> cpus){
        cpus.sort((a,b)->Integer.compare(a[0], b[0]));
        
        PriorityQueue<int[]> pqueue = new PriorityQueue<>(cpus.size(), (a,b)-> Integer.compare(a[1], b[1]));    // Integer holds end value
        
        int currentLoad = 0, maxLoad = 0;

        for(int[] job: cpus) {
            currentLoad += job[2];
            while(!pqueue.isEmpty() && pqueue.peek()[1] < job[0]){
                currentLoad -= pqueue.peek()[2];
                pqueue.remove();
            }

            maxLoad = Math.max(currentLoad, maxLoad);
            pqueue.add(job);
        }

        return maxLoad;
    }
}