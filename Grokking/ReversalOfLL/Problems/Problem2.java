package ReversalOfLL.Problems;

import ReversalOfLL.Node;

public class Problem2 {
    public Problem2(){
        Node head = new Node(1);

        Node node = head;
        int i = 2;
        while(i <= 6){
            node.next = new Node(i);
            node = node.next;
            i++;
        }

        int K = 8;

        int length = getLength(head, 0);

        if(K >= length){
            K = length - K%length;
        }

        i = 1;
        Node first = head;
        Node mid = null;
        Node last = null;

        node = head;
        while(i <= length){
            
            if(i == length - K){
                mid = node;
            }
            
            if(i == length){
                last = node;
            }
            
            node = node.next;
            i++;
        }

        if(mid != null){
            head = mid.next;
            mid.next = null;
            last.next = first;
        }

        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    int getLength(Node node, int count){
        if(node != null){
            return getLength(node.next, count+1);
        } else {
            return count;
        }
    }
}
