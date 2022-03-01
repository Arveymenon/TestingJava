package Subsets;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationByChangingCase {
    public StringPermutationByChangingCase(){
        String input = "ab7c";
        List<String> output = new ArrayList<>();
        output.add(input);
        for(int i=0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(this.isAlphabet(ch)){

                List<String> perms = new ArrayList<>();
                for(int j = 0; j < output.size(); j++){

                    ch = Character.toUpperCase(ch);
                    String newString = output.get(j);
                    String tempString = "";

                    if(i > 0){
                        tempString = 
                            newString.substring(0, i);
                    }
                    tempString = 
                        tempString +
                        ch +
                        newString.substring(i+1, input.length());

                    perms.add(tempString);
                }
                perms.forEach((perm)->{
                    output.add(perm);
                });
            }
        }
        System.out.println(output);
    }

    private boolean isAlphabet(char ch){
        int num = Character.getNumericValue(ch);
        if(num > -1 && num < 10){
            return false;
        }
        return true;
    }
}
