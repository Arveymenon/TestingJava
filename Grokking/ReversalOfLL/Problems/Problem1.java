package ReversalOfLL.Problems;

import ReversalOfLL.Node;

public class Problem1 {
    
    public Problem1(){
        Node head = new Node(1);

        Node node = head;
        int i = 2;
        while(i <= 8){
            node.next = new Node(i);
            node = node.next;
            i++;
        }
        int K = 2;

        Node prev = null;
        node = head;
        i = 1;
        int j = 0;
        while(i <= 6){
            // Rotating Logic
            Node first = node;
            Node before = prev;
            j = 0;
            while(j < K && node != null){
                Node next = node.next;
                node.next = prev;
                prev = node;
                node = next;
                j++;
            }
            if(i == 1){
                head = prev;
            }  else {
                before.next = prev;
            }
            i += K;

            first.next = node;
            
            // Moving Logic
            j = 1;
            while(j <= K && node != null){
                prev = node;
                node = node.next;
                j++;
            }
            i += K;
        }

        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
