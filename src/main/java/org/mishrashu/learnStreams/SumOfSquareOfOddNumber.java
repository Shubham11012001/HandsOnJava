package org.mishrashu.learnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfSquareOfOddNumber {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sumOfSqOfOddNum =
        numbers.stream()
            .filter(n -> n % 2 > 0)
            .mapToInt(n -> n * n)
            .sum();
    System.out.println(sumOfSqOfOddNum);
  }

}
