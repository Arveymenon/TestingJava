package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringDistictCharacters {

    String str = "abccde";

    public LongestSubStringDistictCharacters(){
        int start = 0, end = 0, max_length = 0;
        Map<Character, Integer> c_str = new HashMap<>();

        while(end != str.length()){
            if(c_str.containsKey(str.charAt(end))){
                start = c_str.get(str.charAt(end)) + 1;
                // start = Math.max(start, c_str.get(str.charAt(end)) + 1);
            }
            c_str.put(str.charAt(end), end);
            max_length = Math.max(max_length, end - start + 1);
            end++;
        }

        System.out.println("LongestSubStringDistictCharacters: "+ max_length);
    }
}