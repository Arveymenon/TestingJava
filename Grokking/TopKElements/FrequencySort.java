package TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FrequencySort {
    public FrequencySort(){
        String str = "abcbab";
        Map<Character, Integer> map = new HashMap<>();
        Queue<Map.Entry<Character, Integer>> pqueue = new PriorityQueue<>(
            (a,b)->{
                return b.getValue() - a.getValue();
            });

        for(int i =0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);
        }

        for(Map.Entry<Character, Integer> charc: map.entrySet()){
            pqueue.add(charc);
        }
        StringBuilder op = new StringBuilder();
        while(!pqueue.isEmpty()){
            Map.Entry<Character, Integer> charc = pqueue.poll();
            for(int i = 0; i < charc.getValue(); i++){
                op.append(charc.getKey());
            }
        }
        System.out.println(op.toString());
    }
}
