public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }
}
