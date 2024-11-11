package org.mishrashu.recursion;

public class TowerOfHanoi {


  public static void toh(int n, String a, String b, String c) {
    if (n == 1) {
      System.out.println("Moved Disc " + n + " from " + a + " to " + c);
      return;
    }
    toh(n - 1, "A", "C", "B");
    System.out.println("Moved Disc " + n + " from " + a + " to " + c);
    toh(n - 1, "B", "A", "C");
  }


  public static void main(String[] args) {
    toh(3, "A", "B", "C");
  }


}
