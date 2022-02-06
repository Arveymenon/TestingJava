package CycleSort;

public class CycleSort {

    public CycleSort(){
        int[] arr = new int[] {3,1,5,4,2};
        
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1){
                i++;
            }
            else{
                int temp = arr[i]; // temp = arr[0]; // temp = 3 
                arr[i] = arr[temp - 1]; // arr[0]
                arr[temp - 1] = temp; // temp = 3;
            }
        }

        for(int j: arr){
            System.out.println(j);
        }
        // System.out.println(arr.toString());
    }
}
