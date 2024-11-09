package org.mishrashu.learnCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapInAction {

  public static void main(String[] args) {
    HashMap<String, String> datamap = new HashMap<>();
    datamap.put("name", "shubham");
    datamap.put("surname", "kumar mishra");
    datamap.put("designation", "senior software engineer");
    datamap.put("department", "Enterprise solutions");

    //now i have to sort it by keys;

//    datamap.values().stream().sorted().forEach(System.out::println);

    LinkedHashMap<String, String> sortedLinkedHashap = datamap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(
            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (old, new1) -> old,
                LinkedHashMap::new));

    sortedLinkedHashap.entrySet().forEach((s) -> System.out.println(s));

    LinkedHashMap<String, String> sortedLinkedHashapValue = datamap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(
            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (old, new1) -> old,
                LinkedHashMap::new));

    System.out.println("\n ***************************** ");
    sortedLinkedHashapValue.entrySet().forEach(System.out::println);
  }

}
