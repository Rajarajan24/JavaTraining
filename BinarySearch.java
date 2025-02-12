public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23, 24, 34, 55, 66, 77, 88,};
        int target =56;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;

                }
            }
        return -1;
    }
}