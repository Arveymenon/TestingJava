package FastSlowPointer;

public class MiddleOfLinkedList {

    public MiddleOfLinkedList(){
        int i = 1;
        Node node = new Node();
        Node head = node;

        int n = 10;
        while(i <= n){
            node.value = i;
            if(i == n){
                node.next = null;
                break;
            }

            node.next = new Node();
            node = node.next;
            i++;
        }

        this.findMiddle(head, head.next);
    }

    public void findMiddle(Node slow, Node fast){
        if(fast == null || fast.next == null){
            System.out.println(slow.value);
        } else{
            findMiddle(slow.next, fast.next.next);
        }
    }
}
