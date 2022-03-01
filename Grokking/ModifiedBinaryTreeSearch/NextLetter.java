package ModifiedBinaryTreeSearch;

public class NextLetter {

    public NextLetter(){
        char[] input = new char[]{'a', 'c', 'f', 'h'};
        int start = 0, end = input.length - 1;
        char key = 'j';
        System.out.println(findnextLetter(start, end, input, key));
    }
    
    public char findnextLetter(int start, int end, char[] input, char key){

        while(start <= end){
            int middle = start + ((end - start)/2);
            if(input[middle] < key){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return input[start % input.length];
    }

}
