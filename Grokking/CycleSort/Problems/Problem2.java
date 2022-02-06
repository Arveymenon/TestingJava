package CycleSort.Problems;

public class Problem2 {
    public Problem2(){
        int[] arr = new int[]{3, 2, 5, 1};
        int igCount = 0, i = 0;

        while(i < arr.length){
            if(arr[i] < 1){
                this.swap(i, igCount, arr);
                igCount++;
                i = igCount;
            }
            else if(arr[i] != i - igCount + 1 && arr[i] < arr.length - igCount){
                this.swap(i, igCount + arr[i] - 1, arr);
            }else{
                 i++;
            }
        }
        i = igCount;
        while(i < arr.length){
            if(i - igCount + 1 != arr[i]){
                System.out.println(i - igCount + 1);
                break;
            }
            i++;
        }
        if(i == arr.length){
            System.out.println(i - igCount + 1);
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
