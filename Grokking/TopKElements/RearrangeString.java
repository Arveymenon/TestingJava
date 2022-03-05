package TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RearrangeString {
    public RearrangeString(){
        String str = "Programmingbbbb";
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder op = new StringBuilder();
        
        Queue<Character> maxHeap = new PriorityQueue<>((a,b)->{
            // System.out.println(map.get(b)+"     "+ map.get(a)+" "+ (map.get(b) - map.get(a)));
            return map.get(b) - map.get(a);
        });


        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) == 1){
                maxHeap.add(c);
            }
        }

        char prev_c = ' ';
        for(int i = 0; i < str.length(); i++){
            if(maxHeap.isEmpty()){
                System.out.println("Empty");
            }
            char c = maxHeap.poll();
            
            op.append(c);
            map.put(c, map.get(c) - 1);
            if(prev_c != ' ' && map.get(prev_c) > 0)
                maxHeap.add(prev_c);

            prev_c = c;

        }
        System.out.println(op);
    }
}
