package org.mishrashu.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {

    //logic for insertion sort
    int[] numbers = {1, 2, 6, 8, 1, 0, -1, 19};
    for (int i = 1; i < numbers.length; i++) {
      int temp = numbers[i];
      int j = i - 1;
      while (j >= 0 && numbers[j] > temp) {
        numbers[j + 1] = numbers[j];
        j -= 1;
      }
      numbers[j + 1] = temp;
      System.out.println("Pass" + i + " Completed");

      //to print the array
      Arrays.stream(numbers).forEach(number -> System.out.print(number + ","));
      System.out.println("\n ******************* \n");
    }
  }
}
