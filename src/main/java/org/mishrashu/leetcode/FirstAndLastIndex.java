package org.mishrashu.leetcode;

import java.util.Arrays;

public class FirstAndLastIndex {


  public static void main(String[] args) {

    int[] array = {1};
    int target = 1;
    int[] result = {-1, -1};
    boolean firstFound = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == target && !firstFound) {
        result[0] = i;
        result[1]=i;
        firstFound = true;
      } else if (array[i] == target) {
        result[1] = i;
      }
    }
    Arrays.stream(result).forEach(System.out::println);
  }
}


