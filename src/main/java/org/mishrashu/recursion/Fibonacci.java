package org.mishrashu.recursion;

import java.util.Scanner;

/**
 * Expectations :::: 0,1,1,2,3,5,8,12,20,...........n
 */
public class Fibonacci {

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many fibonacci you are looking for");
    int n = sc.nextInt();
    iterativeFibonacci(n);

    System.out.println(fibonacci(n));


  }

  private static void iterativeFibonacci(int n) {
    int first = 0;
    int second = 1;
    System.out.println(first);
    System.out.println(second);
    for (int i = 2; i <= n; i++) {
      System.out.println(first + second);
      int temp = second;
      second = first + second;
      first = temp;
    }
  }

}
