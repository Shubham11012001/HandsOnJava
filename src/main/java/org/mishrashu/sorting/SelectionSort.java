package org.mishrashu.sorting;


import java.util.Arrays;

public class SelectionSort {

  public static void swap(int[] array, int to, int from) {
    int temp = array[to];
    array[to] = array[from];
    array[from] = temp;
  }


  public static void main(String[] args) {

    int[] numbers = {1, 2, 5, 6, 7, 0, 1};
    //selection sort
    //select the sortest element from the left over part of loop and then swap it
    for (int i = 0; i < numbers.length - 1; i++) {
      int minimumElement = i;
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[minimumElement]) {
          minimumElement = j;
        }
      }

      if (minimumElement != i) {
        swap(numbers, minimumElement, i);
      }
    }

    Arrays.stream(numbers).forEach(number -> System.out.print(number + ","));
  }

}
