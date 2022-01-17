package TwoPointers;

public class SquaringASortedArray {
    public SquaringASortedArray(){
        int[] arr = {-1, -1, 0, 2 ,3};
        int[] output = new int[arr.length];

        int start = 0, end = arr.length - 1, index = arr.length - 1;

        while(start < end){
            if(Math.pow(arr[start], 2) > Math.pow(arr[end], 2)){
                output[index] = (int) Math.pow(arr[start], 2);
                index--;
                start++;
            }else{
                output[index] = (int) Math.pow(arr[end], 2);
                index--;
                end--;
            }
        }
        
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i]);
        }
    }
}
