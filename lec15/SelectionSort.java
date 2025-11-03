public class SelectionSort {

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectionSort(int[] arr)  throws Exception {
        for (int i=0; i<arr.length; i++) {

            int minVal = Integer.MAX_VALUE;
            int minIdx = -1;

            for (int j=i; j<arr.length; j++) {
                    if (arr[j] < minVal) {
                        minVal = arr[j];
                        minIdx = j;
                    }
            }
            System.out.println("Found minimum value: " + minVal);

            swap(arr, i, minIdx);
            printArr(arr);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        printArr(arr);
    }

}
