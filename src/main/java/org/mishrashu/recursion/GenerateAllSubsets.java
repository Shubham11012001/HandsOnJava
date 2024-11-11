package org.mishrashu.recursion;

public class GenerateAllSubsets {

  public static void subSets(String s, int i, String curr) {
    if (i == s.length()) {
      System.out.println(curr);
      return;
    }
    subSets(s, i + 1, curr + s.charAt(i));
    subSets(s, i + 1, curr);
  }


  public static void main(String[] args) {
    subSets("AB", 0, "");
  }

}
