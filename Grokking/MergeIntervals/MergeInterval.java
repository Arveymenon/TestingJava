package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public MergeInterval(){
        List<Integer[]> arr = new ArrayList<>();
        arr.add(new Integer[]{1,4});
        arr.add(new Integer[]{2,5});
        arr.add(new Integer[]{7,9});
        System.out.println(this.getExclusiveIntervals(arr));
    }

    public List<Integer[]> getExclusiveIntervals(List<Integer[]> arr){
        int i = 0;

        while(i < arr.size() - 1){
            if(arr.get(i)[1] > arr.get(i+1)[0]){
                arr.set(i, new Integer[]{
                    arr.get(i)[0],arr.get(i+1)[1]
                });
                arr.remove(i+1);
            }
            i++;
        }

        return arr;
    }
}
