package TopologicalGraph;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopologicalSort {

    public TopologicalSort(){
        List<Integer> results = topoSort(7, new int[][] {
            new int[] {6, 4},
            new int[] {6, 2},
            new int[] {5, 3},
            new int[] {5, 4},
            new int[] {3, 0},
            new int[] {3, 1},
            new int[] {3, 2},
            new int[] {4, 1}
        });
        System.out.println(results);
    }

    public List<Integer> topoSort(int k, int[][] vertices){
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> degree = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Queue<Integer> sources = new LinkedList<>();

        for(int i = 0; i < vertices.length; i++){
            degree.put(vertices[i][1], degree.getOrDefault(vertices[i][1], 0) + 1);
            
            List<Integer> list = graph.getOrDefault(vertices[i][0], new ArrayList<>());
            list.add(vertices[i][1]);
            graph.put(vertices[i][0], list);
        }
        
        for(int i = 0; i < k; i++)
            if(!degree.containsKey(i)){
                sources.add(i);
            }
        
        
        while(!sources.isEmpty()){
            int vertex = sources.poll();
            result.add(vertex);
            if(graph.containsKey(vertex)){
                for(Integer child: graph.get(vertex)){
                    degree.put(child, degree.get(child) - 1);
                    if(degree.get(child) == 0){
                        sources.add(child);
                    }
                }
            }
        }
        return result;
    }
}