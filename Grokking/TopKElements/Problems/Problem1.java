package TopKElements.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem1 {
    public Problem1(){
        String str = "aappa";
        int k = 3;
        System.out.println(this.rearrageKDistanceApart(str, k));
    }

    String rearrageKDistanceApart (String str, int K) {

        StringBuilder op = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        Queue<Character> maxHeap = new PriorityQueue<>((a,b)->{
            return map.get(b) - map.get(a);
        });
        maxHeap.addAll(map.keySet());

        List<Character> prevCharList = new ArrayList<>();

        while(maxHeap.size() > 0){

            Character charc = maxHeap.poll();
            op.append(charc);
            map.put(charc, map.get(charc) - 1);

            prevCharList.add(charc);
            if(prevCharList.size() == K){
                char rem = prevCharList.remove(0);
                if(map.get(rem) > 0){
                    maxHeap.add(rem);
                };
            }

        }

        return op.toString().length() != str.length() ? "" : op.toString();
    }
}