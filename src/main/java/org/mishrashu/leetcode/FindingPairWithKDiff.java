package org.mishrashu.leetcode;

import java.util.Arrays;
import java.util.List;

public class FindingPairWithKDiff {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int k = 5;
    boolean found = false;
    int pointor1 = 0;
    int pointor2 = numbers.size() - 1;
    while (pointor2 > pointor1) {
      if ((numbers.get(pointor2) - numbers.get(pointor1)) == k) {
        System.out.println(numbers.get(pointor1));
        System.out.println(numbers.get(pointor2));
        found = true;
        pointor1++;
        pointor2--;
      } else if ((numbers.get(pointor2) - numbers.get(pointor1)) > k) {
        pointor2--;
      } else {
        pointor1++;
      }
    }

    if (!found) {
      System.out.println(-1);

    }
  }
}
