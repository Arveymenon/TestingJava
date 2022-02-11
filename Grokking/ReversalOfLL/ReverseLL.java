package ReversalOfLL;


public class ReverseLL {

    public ReverseLL(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = this.reverseLL(head, null);

        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    public Node reverseLL(Node node, Node prev){
        if(node != null){
            // reversing logic
            Node next = node.next;
            node.next = prev;
    
            return this.reverseLL(next, node);
        } else {
            return prev;
        }
    }
}
