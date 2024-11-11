package org.mishrashu.recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {


  public static int sumOfNaturalNumbers(int n) {
    if (n < 1) {
      return 1;
    }
    return n + sumOfNaturalNumbers(n - 1);
  }


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
//    result = iterative(n);
//    System.out.println(result + "Iterative");
    result = sumOfNaturalNumbers(n);
    System.out.println(result + "recursive");
  }

  private static int iterative(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += i;
    }
    return result;
  }

}
