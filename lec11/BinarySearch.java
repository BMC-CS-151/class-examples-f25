public class BinarySearch {
    //returns the index of the target (if it exists in data)
    private static int binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        //1. calculate mid value
        int mid = (low + high) / 2;

        //2. handle 3 cases: equal to, lesser than, greater than
        if (data[mid] == target) {
            return mid;
        } else if (data[mid] > target) {
            //search left
            high = mid - 1;
        } else if (data[mid] < target) {
            //search right
            low = mid + 1;
        }
        //3. did we handle the case where target isn't in data?

        return binarySearch(data, target, low, high);
    }

    public static int find(int[] data, int target) {
        return binarySearch(data, target, 0, data.length);
    }
}
