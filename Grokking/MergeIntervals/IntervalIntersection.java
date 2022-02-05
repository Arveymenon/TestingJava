package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {
    public IntervalIntersection() {
        IntervalNode[] arr1 = {
                new IntervalNode(1, 3),
                new IntervalNode(5, 7),
                new IntervalNode(9, 12)
        };
        IntervalNode[] arr2 = {
                new IntervalNode(5, 10)
        };
        this.getIntersections(arr1, arr2).forEach(node->{
            System.out.println(node.start+", "+node.end);
        });
    }

    public List<IntervalNode> getIntersections(IntervalNode[] arr1, IntervalNode[] arr2) {
        List<IntervalNode> output = new ArrayList<>();
        int i = 0, j = 0;

        
        while (i < arr1.length && j < arr2.length) {
            IntervalNode o1 = arr1[i];
            IntervalNode o2 = arr2[j];
            if (o1.start <= o2.start && o1.end >= o2.start) {
                output.add(
                    new IntervalNode(o2.start, Math.min(o1.end, o2.end))
                    );
                if(o1.end < o2.end){
                    i++;
                }else{
                    j++;
                }
                continue;
            }

            if (o2.start <= o1.start && o2.end >= o1.start) {
                output.add(
                    new IntervalNode(o1.start, Math.min(o1.end, o2.end))
                    );
                if(o1.end < o2.end){
                    i++;
                }else{
                    j++;
                }
                continue;
            }

            if(i+1 < arr1.length || (j == arr2.length-1) ) {
                i++;
            }
            if(j+1 < arr2.length) {
                j++;
            }
        }

        return output;
    }
}
