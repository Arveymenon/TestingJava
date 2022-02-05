package SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {
    public Problem2() {
        System.out.println(this.solution("ppqp", "pq"));
    }

    List<Integer> solution(String str, String pattern){
        int start = 0, end = 0, patternMatchcount = 0;
        List<Integer> output = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(char c: pattern.toCharArray()){
            map.put(c, 0);
        }
        
        while(end < str.length()){
            char leftChar = str.charAt(start), rightChar = str.charAt(end);

            if(map.get(rightChar) == 0){
                patternMatchcount++;
            }
            map.put(rightChar, map.get(rightChar) + 1);

            if((end - start + 1) == pattern.length()){

                if(patternMatchcount == pattern.length()){
                    output.add(start);
                }

                if(map.get(leftChar) == 1){
                    patternMatchcount--;
                }

                map.put(leftChar, map.get(leftChar) - 1);
                start++;
            }
            end++;
        }

        return output;
    }
}