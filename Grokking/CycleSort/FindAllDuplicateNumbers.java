package CycleSort;

public class FindAllDuplicateNumbers {

    public FindAllDuplicateNumbers(){
        int[] arr = new int[] {5, 4, 7, 2, 3, 5, 3};
        int i = 1;

        while(i <= arr.length){
            if(arr[i - 1] != i && (  arr[i-1] != arr[arr[i-1] - 1] )){
                this.swap(i-1, arr[i-1] - 1, arr);
            }else{
                i++;
            }
        }
        
        for(i = 0; i < arr.length; i++){
            if(arr[i] - 1 != i ){
                System.out.println( arr[i]);
            }
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
