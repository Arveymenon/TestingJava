package ModifiedBinaryTreeSearch;

public class RangeOfKeys {
    int[] input = new int[] { 1,3,8,10,15 };
    int start = 0, end = input.length - 1;

    public RangeOfKeys() {
        int key = 10;

        int entry = getIndex(start, end, key);
        if (entry != -1) {
            start = entry;
            end = entry;
            while ((start > 0 && input[start - 1] == input[entry]) ||
                    (end + 1 < input.length && input[end + 1] == input[entry])) {
                if (start > 0 && input[start - 1] == input[entry]) {
                    start--;
                }
                if (end + 1 < input.length && input[end + 1] == input[entry]) {
                    end++;
                }
            }

        } else {
            start = -1;
            end = -1;
        }
        System.out.println("[" + start + ", " + end + "]");
    }

    public int getIndex(int start, int end, int key) {
        if (start <= end) {
            if (input[start] == key) {
                return start;
            } else if (input[end] == key) {
                return end;
            }

            int mid = start + ((end - start) / 2);
            if (input[mid] >= key) {
                return getIndex(start + 1, mid, key);
            } else {
                return getIndex(mid, end - 1, key);
            }
        }
        return -1;
    }
}
