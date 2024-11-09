/***
 * https://howtodoinjava.com/java/collections/arraylist/flatten-nested-lists/
 */
package org.mishrashu.learnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {

    public static void main(String[] args) {


        //Declaring an array
        List<List<Integer>> nestedArray = Arrays.asList(Arrays.asList(4, 5, 2),
                Arrays.asList(1, 34, 25), Arrays.asList(12), Arrays.asList(10, 11, 15));

        //flattening the array
        List<Integer> flattenArray = nestedArray.stream().flatMap(Collection::stream).collect(Collectors.toList());
        flattenArray.forEach(System.out::println);



        System.out.println("\n *********** \n");

        //flattening array with reduce
        List<Integer> flattenArray2 = nestedArray.stream().reduce(new ArrayList<>(), (l1, l2) -> {
            l1.addAll(l2);
            return l1;
        });
        flattenArray2.forEach(System.out::println);
    }

}
