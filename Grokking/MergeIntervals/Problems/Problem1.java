package MergeIntervals.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem1 {
    public Problem1(){
        List<int[]> meetingTime = new ArrayList<>();
        meetingTime.add(new int[]{6,7});
        meetingTime.add(new int[]{2,4});
        meetingTime.add(new int[]{8,12});
        
        System.out.println(this.roomRequired(meetingTime));
    }
    private int roomRequired(List<int[]> meetingTime){
        meetingTime.sort((a,b)-> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();

        rooms.add(meetingTime.get(0)[0]);

        // for(int[] slot: meetingTime){
        for(int i = 1; i < meetingTime.size(); i++){
            if(rooms.peek() <= meetingTime.get(i)[0]){
                rooms.remove();
            }
            rooms.add(meetingTime.get(i)[1]);
        }
        
        return rooms.size();
    }
}