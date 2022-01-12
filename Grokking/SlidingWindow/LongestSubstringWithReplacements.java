package SlidingWindow;

public class LongestSubstringWithReplacements {
    String str = "abccde";
    int K = 2;

    public LongestSubstringWithReplacements(){
        int start = 0, end = 0, first_change = 0, max_length = 0;
        char c_char = str.charAt(end);
        int bucket = K;

        while(end != str.length()){
            if(str.charAt(end) == c_char){
                max_length = Math.max(max_length, end - start + 1);
                end++;
                continue;
            } 
            if(bucket == 0){
                bucket = 3;
                start = end = first_change;
                c_char = str.charAt(end);
                continue;
            }
            
            if(bucket == K){
                first_change = end;
            }
            bucket--;
            end++;
            max_length = Math.max(max_length, end - start + 1);
        }
        System.out.println("LongestSubstringWithReplacements: "+ max_length);
    }
}
