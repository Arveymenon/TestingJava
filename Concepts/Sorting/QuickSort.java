class QuickSort{
    
    public static void main(String[] args){
        new QuickSort();
    }

    QuickSort(){
        System.out.println("Hello World");

        int[] arr = new int[]{ 3,4,5,7,2,8,9 };

        this.quickSort(0, arr.length - 1, arr);

        for(int i: arr){
            System.out.print(i+", ");
        }
    }

    public void quickSort(int start, int end, int[] arr){
        if(start < end){
            int pi = this.partition(start, end, arr);
    
            quickSort(start, pi - 1, arr);
            quickSort(pi + 1, end, arr);
        }
    }

    public int partition (int start, int end, int[] arr) {

            int pivot = arr[end];
            int i = start - 1; // actual index of the pivot
    
    
            for (int j = start; j < end; j++) {
                if(arr[j] < pivot){
                    i++;
                    this.swap(i, j, arr);
                }
            }
    
            this.swap(i+1, end, arr);
    
            return i + 1;
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}