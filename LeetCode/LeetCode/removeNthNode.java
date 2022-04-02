package LeetCode;

public class removeNthNode {

    public removeNthNode(){
        ListNode head = new ListNode(1);
    
        head = this.removeNthFromEnd(head, 1);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // if(head == null || head.next == null){
        //     return null;
        // }

        int length = 0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            length++;
        }
        
        length = length - n;
        
        node = head;
        ListNode prev = new ListNode();
        for(int i = 0; i < length; i++){
            prev = node;
            node = node.next;
        }
        if(node == head){
            return node.next;
        }
        
        prev.next = node.next;
        
        return head;
    }   
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}