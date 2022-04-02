package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationsOfPhone {

    public LetterCombinationsOfPhone(){
        System.out.println(this.letterCombinations("7"));
    }

    public List<String> letterCombinations(String digits) {
        
        Queue<String> output = new LinkedList<>();
        output.add("");
        
        for(int i = 0; i < digits.length(); i++){
            output = this.getCombination(output, Integer.parseInt(String.valueOf(digits.charAt(i))));
        }
        
        return (List) output;
    }
    
    Queue<String> getCombination(Queue<String> currentCombinations, int digit){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
            
        int start = 0, end = 0;
        if(digit <= 6){
             start = (digit - 2) * 3;
             end = ((digit - 1) * 3) - 1;
        }
        switch(digit) {
            case 7: 
                start = 15;
                end = 18;
                break;
            case 8:
                start = 19;
                end = 21;
                break;
            case 9:
                start = 22;
                end = 25;
                break;
        }
        
        int length = currentCombinations.size();
        for(int i = 0; i < length; i++){
            String str = currentCombinations.poll();
            for(int j = start; j <= end; j++){
                currentCombinations.add(str+alphabets.charAt(j));
            }
        }
        
        return currentCombinations;
    }
    
}