package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithReplacements {
    String str = "abbcb";
    int k = 1;

    public LongestSubstringWithReplacements() {
        int start = 0, end = 0, maxCount = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end != str.length()){
            char rightChar = str.charAt(end);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1 );
            maxCount = map.get(rightChar);
            
            if(end - start + 1 - maxCount > k){
                char leftChar = str.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1 );
                start++;
            }

            maxLength = end - start + 1;
            end++;
        }
        System.out.println(maxLength);
    }
}
