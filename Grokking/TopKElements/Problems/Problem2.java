package TopKElements.Problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem2 {
    public Problem2(){
        Character[] input = new Character[] {'a', 'b', 'a'};
        int K = 3, output = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(Character val: input)
            map.put(val, map.getOrDefault(val,0) + 1);

        Queue<Character> maxHeap = new PriorityQueue<>((a,b)->{
            return map.get(b) - map.get(a);
        });
        maxHeap.addAll(map.keySet());

        Queue<Character> coolDown = new LinkedList<>();
        for(int i = 0; i < K; i++)
            coolDown.add(null);

        while(map.size() > 0){
            if(!maxHeap.isEmpty()){
                Character charc = maxHeap.poll();
                if(map.get(charc) - 1 > 0){
                    map.put(charc, map.get(charc) -1);
                    coolDown.add(charc);
                }
                else{
                    coolDown.add(null);
                    map.remove(charc);
                }
            }else {
                coolDown.add(null);
            }
            output++;
            
            Character coolChar = coolDown.poll();
            if(coolChar != null){
                maxHeap.add(coolChar);
            }
        }
        System.out.println(output);
    }
}
