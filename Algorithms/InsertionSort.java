public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        insertionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++){
            int val = array[i];
            int j = i - 1;

            while (j>=0 && array[j] > val){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = val;
        }
    }

}
