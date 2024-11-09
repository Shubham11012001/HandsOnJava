package org.mishrashu.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input size of an array");
        int sizeOfArrayList = scanner.nextInt();

        System.out.println("Insert element of array");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < sizeOfArrayList; i++) {
            array.add(scanner.nextInt());
        }

        System.out.println("Insert element to search");
        Integer targetElement = scanner.nextInt();
        int index = searchingOperation(sizeOfArrayList, targetElement, array);
        System.out.println("Element find at index " + index);

    }

    private static int searchingOperation(Integer sizeOfArrayList, Integer targetElement, List<Integer> array) {
        for (int i = 0; i < sizeOfArrayList; i++) {
            if (targetElement.equals(array.get(i))) {
                return i;
            }
        }
        return -1;
    }

}
