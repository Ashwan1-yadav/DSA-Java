public class InsertionSort {
    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j>=0 && val < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 3, 4, 9, 1, 0, 6 };
        insertionSort(arr);
    }
}
