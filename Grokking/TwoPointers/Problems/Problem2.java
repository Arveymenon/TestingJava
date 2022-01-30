package TwoPointers.Problems;

public class Problem2 {
    public Problem2(){
        System.out.println(solveProblem("xy#z", "xzz#"));
    }

    private int fixHash(int index, String str){
        int hashCount = 0;
        while(str.charAt(index) == '#'){
            hashCount++;
            index--;
        }
        index = index - hashCount;
        return index;
    }
    
    public boolean solveProblem(String str1, String str2){
        int s1 = str1.length() - 1;
        int s2 = str2.length() - 1;
    
        while(s1 > -1 && s2 > -1){
            int index = fixHash(s1, str1);
            s1 = index;
            
            index = fixHash(s2, str2);
            s2 = index;
    
            if(str1.charAt(s1) != str2.charAt(s2)){
                return false;
            }else{
                s1--;
                s2--;
            }
        }

        if(s1 > -1 || s2 > -1){
            return false;
        }

        return true;
    }
} 