package org.mishrashu.recursion;

//3,2,1,1,2,3

public class PrintNumbersRecursively {

  public static void recursion(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    recursion(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    recursion(3);
  }

}
