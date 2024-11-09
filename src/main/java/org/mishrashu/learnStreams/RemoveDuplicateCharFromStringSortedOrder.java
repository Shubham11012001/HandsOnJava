package org.mishrashu.learnStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharFromStringSortedOrder {

  public static void main(String[] args) {

    String name = "Shubham";
    List<String> data = Arrays.stream(name.split(""))
        .filter(a -> !a.equalsIgnoreCase("S"))
        .sorted()
        .toList();
    data.forEach(System.out::println);
  }
}
