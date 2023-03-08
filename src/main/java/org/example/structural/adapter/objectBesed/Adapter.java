package org.example.structural.adapter.objectBesed;

public class Adapter extends Target{

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public Adapter(QuickSort quickSort,BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch=binarySearch;
    }
    public Adapter() {
        this.quickSort = new QuickSort();
        this.binarySearch=new BinarySearch();
    }

    @Override
    public void sort(int[] array) {
        quickSort.quicksort(array);
    }

    @Override
    public int search(int[] array, int target) {
        return binarySearch.search(array,target);
    }
}
