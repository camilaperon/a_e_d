package trabalhos.bim4;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Selection Sort: " + java.util.Arrays.toString(arr));
        System.out.println("Tempo: " + (endTime - startTime) + " nanosegundos");
    }
}
