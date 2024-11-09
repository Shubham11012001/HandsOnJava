package org.mishrashu.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {


  //using merge sorts merge
  public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3){
    int counter1 = 0, counter2 = 0, counter3 = 0;
    while(counter1 < arr1.length && counter2 < arr2.length){
      if(arr1[counter1] < arr2[counter2])
        arr3[counter3++] = arr1[counter1++];
      else
        arr3[counter3++] = arr2[counter2++];
    }


    while(counter1 < arr1.length){
      arr3[counter3++]=arr1[counter1++];
    }


    while(counter2 < arr2.length){
      arr3[counter3++]=arr2[counter2++];
    }



    Arrays.stream(arr3).forEach(System.out::println);
  }



  public static void main(String[] args) {
    int[] arr1  = {1,2,5,6,7};
    int[] arr2 = {5,8,9,10};
    int[] arr3 = new int[arr1.length + arr2.length];

    mergeArrays(arr1, arr2, arr3);
    System.out.println("******* NAIVE OUTPUT *******");
    //naive solution
    int counter1 = 0, counter2 = 0, counter = 0;

    //copying array one
    while(counter1 < arr1.length){
      arr3[counter++] = arr1[counter1++];
    }

    //copying array two
    while(counter2 < arr2.length){
      arr3[counter++] = arr2[counter2++];
    }

    Arrays.sort(arr3);
    Arrays.stream(arr3).forEach(System.out::println);
  }

}
