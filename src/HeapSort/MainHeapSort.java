package HeapSort;

import static HeapSort.OrdenaHeapSort.printArray;

public class MainHeapSort {
    public static void main(String[] args) {
        int arr[] = {10,37,42,5,23,12};

        OrdenaHeapSort heapSort = new OrdenaHeapSort();
        heapSort.heapSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);

    }

    }


