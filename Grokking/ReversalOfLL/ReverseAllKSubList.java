package ReversalOfLL;

public class ReverseAllKSubList {

    public ReverseAllKSubList(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        int K = 3;

        Node node = head;
        Node prev = null;
        Node prev_first = null;
        while(node != null){
            Node first = node;

            for(int i = 1; i <= K && node != null; i++){
                Node temp = node.next;
                node.next = prev;
                prev = node;
                node = temp;
            }
            if(prev_first != null){
                prev_first.next = prev;
            } else {
                head = prev;
            }

            first.next = node;
            prev = first;
            prev_first = first;
        }

        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}