package Subsets;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedParenthesis {
    public BalancedParenthesis(){
        int N = 3;

        Queue<String> output = new LinkedList<>();
        output.add("(");
        
        int i = 0;
        while (i < N*2 - 1) {
            int levelOutputs = output.size();
            for(int j = 0; j < levelOutputs; j++){
                String c_string = output.poll();
                if(canAddOpen(c_string, N)){
                    StringBuilder new_str = new StringBuilder(c_string);
                    new_str.append('(');
                    output.add(new_str.toString());
                }
                if(canAddClosing(c_string)){
                    StringBuilder new_str = new StringBuilder(c_string);
                    new_str.append(')');
                    output.add(new_str.toString());
                }
            }
            i++;
        }

        System.out.println(output);
    }

    private boolean canAddOpen(String str, int maxCount){
        int c = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                c++;
            }
            if(c == maxCount){
                return false;
            }
        }
        return true;
    }

    private boolean canAddClosing(String str){
        int openCount = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                openCount++;
            }
            if(str.charAt(i) == ')'){
                openCount--;
            }
        }
        if(openCount > 0){
            return true;
        }
        return false;
    }
}
