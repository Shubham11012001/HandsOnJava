package org.mishrashu.recursion;

/**
 * input : 253 output : 10
 * <p>
 * <p>
 * input : 100 output : 1
 */

public class SumOfNumbers {


  public static int sumOfNums(int n) {
    int result = 0;
    if (n <= 10) {
      return n;
    }
    result =  sumOfNums(n / 10) + (n % 10);
    return result;
  }


  public static void main(String[] args) {
    System.out.println(sumOfNums(253));
  }
}
