package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    String str = "abcbbc";
    int K = 2;
    Map<Character, Boolean> chars = new HashMap<>();

    public FruitsIntoBasket(){
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
            ) != null) {
                end++;
            } else {
                chars.clear();
                start = end;
                chars.put(str.charAt(end), true);
            }
            
            max_length = Math.max(max_length, end - start);
        }

        System.out.println(max_length);
    }
}
