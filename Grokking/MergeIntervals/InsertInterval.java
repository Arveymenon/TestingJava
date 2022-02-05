package MergeIntervals;

import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public InsertInterval(){
        List<IntervalNode> arr = new LinkedList<>();
        arr.add(new IntervalNode(1,3));
        arr.add(new IntervalNode(5,7));
        arr.add(new IntervalNode(8,12));

        IntervalNode nodeToInsert = new IntervalNode(4,6);

        System.out.println();
        this.insertNode(arr, nodeToInsert).forEach((node)->this.printList(node));
    }

    public void printList(IntervalNode node){
        System.out.println(node.start+", "+node.end);
    }

    public List<IntervalNode> insertNode(List<IntervalNode> arr, IntervalNode insertNode){
        List<IntervalNode> output = new LinkedList<>();
        int i = 0;

        // add smaller nodes
        while(i < arr.size() && arr.get(i).end <= insertNode.start){
            output.add(arr.get(i));
            i++;
        }

        IntervalNode newNode = new IntervalNode();
        while(i < arr.size() && arr.get(i).start <= insertNode.end){
            newNode.start = Math.min(arr.get(i).start, insertNode.start);
            newNode.end = Math.max(arr.get(i).end, insertNode.end);
            i++;
        }
        output.add(newNode);

        while (i < arr.size()) {
            output.add(arr.get(i));
            i++;
        }

        return output;
    }
}
