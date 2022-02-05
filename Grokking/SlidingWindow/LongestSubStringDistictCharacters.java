package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringDistictCharacters {

    String str = "abbbb";

    public LongestSubStringDistictCharacters(){
        System.out.println("LongestSubStringDistictCharacters");

        int start = 0, end = 0, max_length = 0;
        Map<Character, Integer> c_str = new HashMap<>();

        while(end != str.length()){
            if(c_str.get(str.charAt(end)) != null){
                start = c_str.get(str.charAt(end)) + 1;
                
            }
            
            c_str.put(str.charAt(end), end);
            max_length = Math.max(max_length, end - start + 1);

            end++;
        }

        System.out.println(max_length);
    }
}