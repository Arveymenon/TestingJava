package CycleSort.Problems;

public class Problem1 {
    public Problem1(){
        int[] arr = new int[]{3, 1, 2, 3, 6, 4};

        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1 && arr[i] != arr[arr[i] - 1]){
                swap(i, arr[i] - 1, arr);
            }else{
                i++;
            }
        }

        i=0;
        while(i< arr.length){
            if(i+1 != arr[i]){
                System.out.println(arr[i]+", "+(i+1) );
                break;
            }
            i++;
        }
    }

    private void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
