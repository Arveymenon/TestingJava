package FastSlowPointer;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    Map<Integer, Boolean> map = new HashMap<>();

    public HappyNumber(){
        int number = 23;
        checkHappy(number);
    }
    public void checkHappy(int number){

        int slow = number;
        int fast = (int) (getSquare(slow));
        while(slow != fast && number != 1){
            slow = (int) (getSquare(slow));
            number = slow;

            fast = (int) (getSquare(getSquare(fast)));
        }

        System.out.println(number == 1 ? true : false);
    }

    public int getSquare(int num){
        int sum = 0, digit = 0;

        while(num > 0){
            digit = num%10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}
