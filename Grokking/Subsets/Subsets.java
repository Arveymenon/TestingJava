package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public Subsets(){
        int[] input = new int[] {1,3,5};
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        for(int ip: input){
            int i = 0;
            int size = output.size();
            while(i < size){
                List<Integer> arr = new ArrayList<>(output.get(i));
                arr.add(ip);
                output.add(arr);
                i++;
            }
        }
        System.out.println(output.toString());
    }
}