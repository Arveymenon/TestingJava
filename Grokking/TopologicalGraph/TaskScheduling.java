package TopologicalGraph;

import java.util.*;
import java.util.Map.Entry;

public class TaskScheduling {
    public TaskScheduling(){

        int[][] prerequisites = new int [][] {
            new int[] {2,5},
            new int[] {0,5},
            new int[] {0,4},
            new int[] {1,4},
            new int[] {3,2},
            new int[] {1,3}
        };
        int Tasks = 6;

        Map<Integer, List<Integer>> pre_map = new HashMap<>();
        Map<Integer, Boolean> completed = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;



        for(int i = 0; i < prerequisites.length; i++){
            List<Integer> item = pre_map.getOrDefault(prerequisites[i][1], new ArrayList<>());
            item.add(prerequisites[i][0]);

            pre_map.put(prerequisites[i][1], item);
            queue.add(prerequisites[i][1]);

            completed.put(prerequisites[i][1], false);
        }
        
        while(!queue.isEmpty() && count < Tasks){
            int ele = queue.poll();
            if(pre_map.containsKey(ele)){

                for(int i = 0; i < pre_map.get(ele).size(); i++){
                    if(!completed.containsKey(pre_map.get(ele).get(i)) || completed.get(pre_map.get(ele).get(i)) == true){
                        pre_map.get(ele).remove(i);
                    }
                }
                if(pre_map.get(ele).size() == 0){
                    completed.put(ele, true);
                }else{
                    queue.add(ele);
                    count++;
                }
            } else {
                count = 0;
            }
        }
        if(queue.size() > 0){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
