package org.mishrashu.learnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        int[][] array = {{4, 5, 2}, {1, 34, 23}, {12}, {10, 11, 15}};

        //write a logic to flaten this array
        //Brute force
        List<Integer> flattenArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flattenArray.add(array[i][j]);
            }
        }
        flattenArray.stream().sorted().forEach(System.out::println);
    }


}
