package Subsets;

import java.util.ArrayList;
import java.util.List;

public class UniqueGeralizedAbb {
    public UniqueGeralizedAbb(){
        String str = "code";
        int n = str.length();
        List<String> output = new ArrayList<>();
        output.add(str);
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                String subString = str.substring(i, j);
                output.add(this.createOutput(subString, str, i));
            }
        }
        System.out.println(output.toString());
    }

    public String createOutput(String subString, String str, int i){
        StringBuilder newStr = new StringBuilder();
        if(i > 0){
            newStr.append(str.substring(0, i));
        }
        if(subString.length() > 0){
            newStr.append(subString.length());
        }
        newStr.append(str.substring(i + subString.length(), str.length()));

        return newStr.toString();
    }
}
