package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<Integer[]> output = new ArrayList<>();
    public Permutations(){
        Integer[] input = new Integer[] {1, 3, 5, 4};
        List<List<Integer>> perms = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();

        for(int num: input){
            if(perms.isEmpty()){
                List<Integer> arr = new ArrayList<Integer>();
                arr.add(num);
                perms.add(arr);
                continue;
            }
            int n = perms.size();
            for(int i = 0; i < n; i++){

                List<Integer> perm = perms.remove(0);
                for(int j = 0; j <= perm.size(); j++){
                    List<Integer> new_perm = new ArrayList<>(perm);
                    new_perm.add(j, num);
                    if(new_perm.size() == input.length){
                        output.add(new_perm);
                    }else{
                        perms.add(new_perm);
                    }
                }
            }
        }
        System.out.print(output);
    }
}
