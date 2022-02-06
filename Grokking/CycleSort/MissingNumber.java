package CycleSort;

public class MissingNumber {
    
    public MissingNumber(){
        int[] arr = new int[]{2, 3, 1, 8, 2, 3, 5, 1};
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length + 1 && ( arr[i] != i + 1 ) && arr[i] != arr[arr[i] - 1]){
                this.swap(i, arr[i] - 1, arr);
            }else{
                i++;
            }
        }
        i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                System.out.println("Incorrect index: "+ (i + 1));
            }
            i++;
        }
    }

    private void swap (int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}