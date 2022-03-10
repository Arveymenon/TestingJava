package MergeKSortedLists;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class ListNode{
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value;
    }
}

public class KthSmallestElement {
    public KthSmallestElement(){
        ListNode L1 = new ListNode(5);
        L1.next = new ListNode(8);
        L1.next.next = new ListNode(9);
 
        ListNode L2 = new ListNode(1);
        L2.next = new ListNode(7);

        int k = 3;

        Queue<ListNode> minHeap = new PriorityQueue<>((prev,next)->{
            return prev.value - next.value;
        });

        minHeap.addAll(Arrays.asList(L1, L2));

        int i = 0;
        while(!minHeap.isEmpty() && i < k - 1){
            ListNode node = minHeap.poll();
            if(node.next != null){
                node = node.next;
                minHeap.add(node);
            }
            i++;
        }
        System.out.println(minHeap.poll().value);
    }
}
