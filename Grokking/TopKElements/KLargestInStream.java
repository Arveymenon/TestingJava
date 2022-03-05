package TopKElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestInStream {
    GetLargestNumber getLargestNumber;
    public KLargestInStream(){
        this.getLargestNumber = new GetLargestNumber(new Integer[] {3, 1, 5, 12, 2, 11}, 4);

        System.out.println(this.getLargestNumber.getLargestInWith(6));
        System.out.println(this.getLargestNumber.getLargestInWith(13));
        System.out.println(this.getLargestNumber.getLargestInWith(4));
    }
}

class GetLargestNumber{
    Queue<Integer> pqueue = new PriorityQueue<>();
    int k;
    public GetLargestNumber(Integer[] arr, int k){
        // this.arr = new ArrayList<>(Arrays.asList(arr));
        for(int i = 0; i < arr.length; i++){
            pqueue.add(arr[i]);
            if(pqueue.size() < k && arr[i] < pqueue.peek()){
                pqueue.poll();
            }
        }
        this.k = k;
    }
    
    public int getLargestInWith(int num){
        if(num > pqueue.peek()){
            pqueue.poll();
            pqueue.add(num);
            return num;
        }
        return pqueue.peek();
    }
}