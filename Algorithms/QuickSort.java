public class QuickSort {
    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        quickSort(array, 0, array.length-1);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {

        if(high <= low) return; //base case

        int pivot = partition(array, low, high);

        quickSort(array, low, pivot-1); //right side array
        quickSort(array, pivot+1, high); //left side array
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(array[j] < pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // insert pivot to it's location
        i++;
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }
}
