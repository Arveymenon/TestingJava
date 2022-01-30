package SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {
    public Problem4(){
        this.solution("catcatfoxfox", new String[]{"cat", "fox"});
    }
    
    public void solution(String str, String[] Words){
        int start = 0, match = 0, word_length = Words[0].length();
        String lastWord = (String) str.subSequence(0, word_length);
        String firstWord = (String) str.subSequence(0, word_length);

        List<Integer> output = new ArrayList<>();
        Map<String, Boolean> map = new HashMap<>();

        for(String w_str: Words){
            map.put(w_str, false);
        }

        for(int end = 0; end < str.length() - 1; end += word_length){
            lastWord = (String) str.subSequence(end, end + word_length);
            if(map.get(lastWord)){
                while(!lastWord.matches(firstWord)) {
                    map.put(firstWord, false);
                    start += word_length;
                    firstWord = (String) str.subSequence(start, start + word_length);
                    match--;
                }
                start += word_length;
                if(start + word_length > str.length()){
                    break;
                }
                firstWord = (String) str.subSequence(start, start + word_length);
            }
            
            if(!map.get(lastWord)){
                map.put(lastWord, true);
                match++;
            }

            if(match == Words.length){
                output.add(start);
                
                firstWord = (String) str.subSequence(start, start + word_length);
                map.put(firstWord, false);
                start+=word_length;
                match--;
            }
        }

        System.out.println(output);
    }
}
