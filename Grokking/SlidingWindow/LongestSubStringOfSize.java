package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringOfSize {

    String str = "abcbbc";
    int K = 2;
    Map<Character, Boolean> chars = new HashMap<>();

    public LongestSubStringOfSize(){
        int start = 0, end = 0, max_length = 0;

        while(end != str.length()){
            if(chars.size() < K){
                chars.put(str.charAt(end), true);
                end++;
                max_length = Math.max(max_length, end - start);
                continue;
            }
            if(chars.get(
                str.charAt(end)
            ) == null){
                char str_char = str.charAt(start);
                while(str_char == str.charAt(start)){
                    start++;
                }
                chars.remove(str_char);
                chars.put(str.charAt(end), true);
            }
            end++;
            
            max_length = Math.max(max_length, end - start);
        }

        System.out.println(max_length);
    }
}