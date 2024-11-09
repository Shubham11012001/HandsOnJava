package org.mishrashu.learnStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {


  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1,2,3,4,5,10,9,8,7);


    //Given a list of numbers, find the second largest number using Streams

    Integer int1 =  list
        .stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .min(Comparator.naturalOrder())
        .get();
    System.out.println(int1);
  }

}
