package SlidingWindow.Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public Problem1(){
        System.out.println(this.patternMatching());
    }
    
    public boolean patternMatching() {
        String str = "bcdxabcdy";
        String pattern = "bcdyabcdx";
    
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    
        int start = 0, matched = 0;
        for(int end = 0; end < str.length(); end++) {
            char rightChar = str.charAt(end);
            
            if (map.containsKey(rightChar)) {
                map.put(rightChar,map.get(rightChar) - 1);
                if(map.get(rightChar) == 0) 
                    matched ++;
            }
    
            if (matched == map.size()) {
                return true;
            }

            if (end >= pattern.length() - 1) {
                char leftChar = str.charAt(start++);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0){
                        matched--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
            }
        }

        return false;
    }
}