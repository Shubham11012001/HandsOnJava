package org.mishrashu.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

  public static int binarySearchHelper(List<Integer> array, int low, int high, int target) {

    int mid = 0;
    if (high >= low) {
      mid = low + (high - low) / 2;
        if (array.get(mid) == target) {
            return mid;
        }
        if (array.get(mid) > target) {
            return binarySearchHelper(array, low, mid - 1, target);
        }
      return binarySearchHelper(array, mid + 1, high, target);
    }

    return -1;
  }


  public static void main(String[] args) {

    System.out.println("Size of array");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();

    System.out.println("Insert array");
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      array.add(scanner.nextInt());
    }

    System.out.println("Element to find");
    int targetElement = scanner.nextInt();

    int searchResults = binarySearchHelper(array, 0, size - 1, targetElement);
    System.out.println("The result of binary search is " + searchResults);
  }
}
