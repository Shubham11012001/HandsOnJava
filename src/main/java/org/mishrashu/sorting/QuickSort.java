package org.mishrashu.sorting;

import java.util.Arrays;

public class QuickSort {


  public static int partition(int[] array,int low, int high){
    int pivot = array[low];
    int j = high;
    int i = low;
    while(j<i){
      while(array[i] <= pivot) i+=1;
      while(array[j] > pivot) j-=1;
      if(i<j){
        swap(array, j, i);
      }

      swap(array, j, low);
    }
    return j;
  }


  public static void quickSort(int[] array, int low, int high){
    if(low<high){
      int pivot = partition(array, low, high);
      quickSort(array, low, pivot-1);
      quickSort(array, pivot+1, high);
    }
  }

  private static void swap(int[] array, int j, int i) {
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp;
  }


  public static void main(String[] args) {

    int[] array = {1, 2, 4, 5, 3, 19, 10, 11};
    quickSort(array, 0, array.length-1);

    Arrays.stream(array).forEach(number -> System.out.println(number + ","));
  }


}
