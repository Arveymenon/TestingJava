import java.util.Collections;
import java.util.PriorityQueue;

class temp {
    public static void main(String[] args){
    new temp();
    }
    
    temp(){
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        // PriorityQueue<Integer> myQueue = new PriorityQueue<>(Collections.reverseOrder());

        myQueue.add(5);
        myQueue.add(7);
        myQueue.add(3);
        System.out.println(myQueue.toString());
        myQueue.poll();
        System.out.println(myQueue.toString());
        myQueue.remove(7);
        System.out.println(myQueue.toString());
    }
}
