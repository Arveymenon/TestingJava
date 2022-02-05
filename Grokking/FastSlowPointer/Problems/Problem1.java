package FastSlowPointer.Problems;

import FastSlowPointer.Node;

public class Problem1 {
    public Problem1(){
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(2);
        n1.next.next.next.next.next = new Node(1);

        System.out.println(this.isPalindrome(n1));
    }

    public boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = slow.next.next;
        }

        // slow is at the center right now
        Node right = this.reverse(slow);
        Node left = head;

        while (right != null) {
            if(right.value != left.value){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public Node reverse(Node node){
        Node pre = null;
        Node curr = node;
        Node next = null;
        while(curr != null){
            next = curr.next;
            
            curr.next = pre;
            pre = curr;

            curr = next;
        }

        return pre;
    }
}