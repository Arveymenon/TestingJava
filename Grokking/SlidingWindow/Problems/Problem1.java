package SlidingWindow.Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public Problem1(){
        String str = "oidbcaf";
        String pattern = "abc";

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            map.put(c, map.getOrDefault(c, 0));
            
        }
    }
}