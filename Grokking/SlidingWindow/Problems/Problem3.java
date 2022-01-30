package SlidingWindow.Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    public Problem3(){
        System.out.println(this.solve("adcad", "abc"));
    }   

    public String solve(String str, String pattern){
        int start = 0, end = 0, matchCount = 0;
        int si = 0, ei = str.length();
        Map<Character, Integer> map = new HashMap<>();

        for(char c: pattern.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        while(end < str.length()){
            char leftChar = str.charAt(start), rightChar = str.charAt(end);

            if(end != start && leftChar == rightChar){
                start++;
                continue;
            }

            if (map.containsKey(rightChar) && map.get(rightChar) > 0) {

                    
                    map.put(rightChar, map.get(rightChar) - 1);

                    if(map.get(rightChar) == 0){
                        matchCount++;
                    }
                    
                }

                if (matchCount == map.size()) {

                    if(map.get(leftChar) == 0){
                        matchCount--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);

                    
                    if(ei - si > end - start){
                        si = start;
                        ei = end;
                    }
                
                start++;
                while(start < str.length() && !map.containsKey(str.charAt(start))){
                    start++;
                }

            }
            end++;
        }

        if(ei - si == str.length()){
            return "";
        }

        String output = "";
        while(si <= ei){
            output+=str.charAt(si);
            si++;
        }
        return output;
    }
}