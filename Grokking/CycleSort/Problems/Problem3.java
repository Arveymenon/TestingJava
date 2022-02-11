package CycleSort.Problems;

public class Problem3 {
    public Problem3(){
        int[] arr = new int[]{3, -1, 4, 5, 5};
        int K = 3;
        int i = 0;

        while(i < arr.length){
            if(
                arr[i] > 0 &&
                i + 1 != arr[i] && // value check
                arr[i] != arr[arr[i] - 1] // skip same numbers
                ){
                    this.swap(i, arr[i] - 1, arr);
            } else{
                 i++;
            }
        }

        i = 0; 
        int j = 0; // j is   ouput prints
        while(j < K){
            if(i >= arr.length || arr[i] != i + 1){
                System.out.println(i+1);
                j++;
            }
            i++;
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}