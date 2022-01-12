package SlidingWindow;

public class SlidingWindow1 {

    public int[] pubArray = new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2};
    int K = 5;
    
    public SlidingWindow1() {
        print();
    }

    public void print() {
        double[] result = new double[pubArray.length - K + 1];

        double sum = 0;
        int removePosition = -1;
        
        for(int windowEnd = 0; windowEnd < pubArray.length; windowEnd++){
            sum += pubArray[windowEnd];
            if(windowEnd >= K - 1){
                result[windowEnd - K + 1] = sum/K;
                removePosition++;
                sum -= pubArray[removePosition];
            }
        }

        printArray(result);
    }

    private void printArray(double[] array){
        System.out.println("Printing Array");
        for(int i = 0; i <= array.length - 1; i++){
            System.out.println(array[i]);
        }
    }
}