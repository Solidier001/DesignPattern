package org.example.structural.adapter.classBased;

public class Adapter extends QuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        super.sort(array,0,array.length-1);
    }
}
