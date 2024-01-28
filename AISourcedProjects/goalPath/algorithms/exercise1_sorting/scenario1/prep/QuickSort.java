package algorithms.exercise1_sorting.scenario1.prep;

public class QuickSort {

    public static void sort(int[] array, int startIndex, int endIndex) {

        if (!(startIndex < endIndex))
            return;

        int partitionIndex = partition(array, startIndex, endIndex);
        sort(array, startIndex, partitionIndex - 1);
        sort(array, partitionIndex + 1, endIndex);
    }

    private static int partition(int[] array, int startIndeex, int endIndex) {
        int pivot = array[endIndex];
        int partitionIndex = startIndeex;
        int temp;

        for (int i = startIndeex; i < endIndex; i++) {
            if (array[i] <= pivot){
                temp = array[i];
                array[i] = array[partitionIndex];
                array[partitionIndex] = temp;
                partitionIndex++;
            }
        }   

        temp = array[partitionIndex];
        array[partitionIndex] = array[endIndex];
        array[endIndex] = temp;

        return partitionIndex;
    }
}
