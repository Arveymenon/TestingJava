package TopKElements.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem3 {
    public Problem3(){
        FrequencyStack fs = new FrequencyStack();
        fs.push(1);
        fs.push(2);
        fs.push(3);
        fs.push(2);
        fs.push(1);
        fs.push(2);
        fs.push(5);

        System.out.println(fs.pop());
        System.out.println(fs.pop());
        System.out.println(fs.pop());
    }
}

class FrequencyStack{
    // number, frequency
    Map<Integer, Integer> map = new HashMap<>();
    Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
        return map.get(b) - map.get(a);
    });

    void push(int num){
        map.put(num, map.getOrDefault(num, 0) + 1);
        if(!maxHeap.contains(num)){
            maxHeap.add(num);
        }
    }

    int pop(){
        int peek = maxHeap.poll();
        if(maxHeap.peek() == null || map.get(peek) == 0) return 0;

        map.put(peek, map.get(peek) - 1);
        return peek;
    }
}
