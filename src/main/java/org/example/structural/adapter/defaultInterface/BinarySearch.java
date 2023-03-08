package org.example.structural.adapter.defaultInterface;

public class BinarySearch {
    public int search(int[] array, int target) {
        int left=0,right=array.length,mid=(left+right)/2;
        while (left<=right){
            if (array[mid]==target)
                return mid;
            if (array[mid]<target)
                left=mid+1;
            if (array[mid]>target)
                right=mid-1;
            mid=(left+right)/2;
        }
        return -1;
    }
}
