package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {

    public SubsetsWithDuplicates(){
        int[] input = new int[] {1,3,3};
        Arrays.sort(input);
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());

        for(int ip = 0; ip < input.length; ip++){
                int i = 0;
                int size = output.size();

                while(i < size){
                    List<Integer> arr = new ArrayList<>(output.get(i));
                    arr.add(input[ip]);
                    if(!output.contains(arr)){
                        output.add(arr);
                    }
                    i++;
                }
        }
        System.out.println(output.toString());
    }
}
