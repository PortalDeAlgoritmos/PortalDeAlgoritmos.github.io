package algoritimos;

/**
 *
 * @author Helio
 */
public class BubbleSort {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.print("\n");
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //troca os elementos
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int array[] = {10, 5, 2, 8, 11};
        // antes de ordenar
        printArray(array);
        // ordenando o array
        bubbleSort(array);
        // depois de ordenar
        printArray(array);
    }

}
