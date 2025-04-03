public class MergeSort {

    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        mergeSort(array, 0, array.length - 1);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array, int left, int right) {

        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);

            merge(array, left, mid, right);
        }

    }

    private static void merge(int[] array, int left, int mid, int right) {

        int leftSize = mid- left + 1;  //size of left array
        int rightSize = right - mid;    //size of right array

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for(int x = 0; x< leftSize; x++)
        {
            leftArr[x] = array[left +x];
        }
        for(int x = 0; x< rightSize; x++)
        {
            rightArr[x] = array[mid+1+x];
        }

        int leftInd =0;
        int rightInd =0;
        int arrayInd = left;

        while(leftInd < leftSize && rightInd < rightSize)
        {
            if(leftArr[leftInd] <= rightArr[rightInd])
            {
                array[arrayInd] = leftArr[leftInd];
                leftInd++;
            }
            else {
                array[arrayInd] = rightArr[rightInd];
                rightInd++;
            }
            arrayInd++;
        }

        while(leftInd < leftSize)
        {
            array[arrayInd] = leftArr[leftInd];
            leftInd++;
            arrayInd++;
        }
        while(rightInd < rightSize)
        {
            array[arrayInd] = rightArr[rightInd];
            rightInd++;
            arrayInd++;
        }
    }
}
