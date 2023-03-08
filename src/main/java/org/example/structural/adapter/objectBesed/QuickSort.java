package org.example.structural.adapter.objectBesed;

public class QuickSort {
    public void quicksort(int[] array) {
        sort(array,0,array.length-1);
    }

    public void sort(int[] array, int left,int right){
        if (left>=right) return;
        int key=partition(array,left,right);
        sort(array,left,key-1);
        sort(array,key+1,right);
    }


    public int partition(int[] array, int left,int right){
        int key=array[left];
        while (left<right){
            while (left<right&&array[right]>key) right--;
            if (left<right)
                array[left]=array[right];
            while (left<right&&array[left]<key) left++;
            if (left<right)
                array[right]=array[left];
        }
        array[left]=key;
        return left;
    }
}
