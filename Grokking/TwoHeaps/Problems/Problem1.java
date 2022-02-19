package TwoHeaps.Problems;

import java.util.PriorityQueue;

public class Problem1 {
    public Problem1(){
        int[][] intervals = new int[][] {
            new int[]{3, 4},
            new int[]{1, 5},
            new int[]{4, 6},
        };
        int[] output = new int[intervals.length];
        PriorityQueue<Integer> minStartTime = new PriorityQueue<>((a,b) -> intervals[a][0] - intervals[b][0]);
        PriorityQueue<Integer> maxStartTime = new PriorityQueue<>((a,b) -> intervals[b][0] - intervals[a][0]);

        for(int i = 0; i < intervals.length; i++){
            maxStartTime.add(i);
        }

        for(int i = 0; i < intervals.length; i++){
            while(intervals[i][1] <= intervals[maxStartTime.peek()][0]){
                minStartTime.add(maxStartTime.poll());
            }
            output[i] = minStartTime.isEmpty() ? -1 : minStartTime.remove();
            while(minStartTime.size() > 0){
                maxStartTime.add(minStartTime.remove());
            }
        }
        for(int val: output){
            System.out.println(val);
        }
    }
}
