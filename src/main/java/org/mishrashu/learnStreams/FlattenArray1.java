package org.mishrashu.learnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray1 {

  public static Integer[] flattenArray1(Object[] array){
    List<Integer> flattedArray = new ArrayList<>();
    if(array != null){
      for (Object o : array) {
        if (o instanceof Integer) {
          flattedArray.add((Integer) o);
        } else {
          Integer[] arr = flattenArray1((Object[]) o);
          flattedArray.addAll(Arrays.stream(arr).toList());
        }
      }
    }
    return flattedArray.toArray(Integer[]::new);
  }


  public static void main(String[] args) {

    Object[] array = {1,2,3, new Object[] {4,5,6, new Object[]{7,8,9},10},11, new Object[]{12}};

    //expected output - 1,2,3,4,5,6,7,8,9,10,11,12

    Integer[] arr = flattenArray1(array);
    Arrays.stream(arr).forEach(System.out::println);
  }
}
