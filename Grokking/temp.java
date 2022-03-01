import java.util.Collections;
import java.util.PriorityQueue;

class temp {
    public static void main(String[] args){
        new temp();
    }
    
    temp(){
        System.out.println(1%4);
    }

    private boolean isAlphabet(char ch){
        int num = Character.getNumericValue(ch);
        if(num > -1 && num < 10){
            return false;
        }
        return true;
    }
}
