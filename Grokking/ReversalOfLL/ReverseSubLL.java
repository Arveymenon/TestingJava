package ReversalOfLL;

public class ReverseSubLL {
    Node n1;
    Node n2;

    public ReverseSubLL(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        this.reverseSubLL(head, null, 2, 4, 1);

        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    public Node reverseSubLL(Node node, Node prev, int p, int q, int i){
        if(node != null){
            if(i > p && i <= q){
                // cycle here
                Node next = node.next;
                node.next = prev;

                if(i == q){
                    this.n1.next = node;
                    this.n2.next = next;
                    return this.reverseSubLL(next, this.n2, p, q, i+1);
                }

                return this.reverseSubLL(next, node, p, q, i+1);
            }
            if(i == p){
                this.n1 = prev;
                this.n2 = node;
            }
            return this.reverseSubLL(node.next, node, p, q, i+1);
        } else {
            return prev;
        }
    }
}
