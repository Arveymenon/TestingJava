package FastSlowPointer;

public class LinkedListCycle {

    public LinkedListCycle(){
        int i = 0;
        Node node6 = new Node();

        Node node = new Node();
        Node head = node;
        
        while(i <= 10){
            node.value = i;
            if(i==6){
                node6 = node;
            }
            if(i==10){
                node.next = node6;
            } else {
                node.next = new Node();
                node = node.next;
            }
            i++;
        }

        System.out.println(this.cycleCheck(head, head.next).value);
    }

    public Node cycleCheck(Node slow, Node fast){
        if(slow == fast){
            return slow;
        } 
        return cycleCheck(slow.next, fast.next.next);
    }

    public void printNode (Node head) {
        if(head != null){
            System.out.println(head.value);
            printNode(head.next);
        }
    }
}