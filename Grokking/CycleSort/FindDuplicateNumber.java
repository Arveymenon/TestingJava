package CycleSort;

public class FindDuplicateNumber {

    public FindDuplicateNumber() {
        int[] arr = new int[] { 2, 4, 1, 4, 4 };

        int i = 1;
        while (i < arr.length) {
            if (arr[i - 1] != i) {
                // condition for same number
                if (arr[i - 1] == arr[arr[i - 1] - 1]) {
                    break;
                }

                // swapping code
                int temp = arr[i - 1];
                arr[i - 1] = arr[temp - 1];
                arr[temp - 1] = temp;

            } else {
                i++;
            }
        }
        System.out.println(arr[i - 1]);
    }
}
