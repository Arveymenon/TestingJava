import java.util.*;

public class Solution {
    
    public Solution(){}
    
    public String countAndSay(int n) {
        if(n < 1) return "";
        if(n == 1) return "1";
        
        Queue<Integer> output = new LinkedList<>();
        output.add(1);
            
        for(int i = 0; i < n-1; i++){
            
            int j = output.size();
            while(j > 0){
                int ele = output.poll();
                j--;
                
                int count = 1;
                while(output.size() > 0 && output.peek() == ele){
                    count++;
                    output.remove();
                    j--;
                }
                output.add(count);
                output.add(ele);
            }
            
        }
        
        StringBuilder str = new StringBuilder();
        while(output.size() > 0){
            str.append(Integer.toString(output.poll()).charAt(0));
        }
        return str.toString();
    }
    
    public static void main(String args[]){
        System.out.println(new Solution().countAndSay(4));
    }
}