package org.mishrashu.sorting;

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {

    //lets implement bubble sort

    ArrayList<Integer> list = new ArrayList<>(10);
    list.addAll(Arrays.asList(1, 4, 5, -1, 2, 3,0, 10));

    //Now how bubble sort works
    //Consecutive comparison, now every element will be compared to its next element and if the element is
    //small then we will swap

    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        if (list.get(j) > list.get(j+1)) {
          swap(list, j, j+1);
        }
      }
    }

    list.forEach(System.out::println);
  }
}
