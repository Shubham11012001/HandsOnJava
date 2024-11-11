package org.mishrashu.recursion;


/**
 * Notes
 * <p>
 * A function is called tail recursive, if and only if there is no operation after the recursive
 * call that means the method call is the last thing to do in the end of function
 */

public class TailRecursionInAction {


  /**
   * this method will print numbers n to 1
   *
   * @param n
   */
  public static void tailRecursionExample(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    tailRecursionExample(n - 1);
  }

  /**
   * This method will print 1 to N
   *
   * @param n
   */
  public static void print1ToN(int n) {
    if (n == 0) {
      return;
    }
    print1ToN(n - 1);
    System.out.println(n);
  }


  /**
   * This method will print 1 to N utilizing power of tail recursion
   *
   * @param n
   * @param k
   *
   * Logic :::: we have passed an additional parameter as K that is working as our data to
   *          print with every recusive call, I am increasing it as one and whereas I need to go
   *          upto 10 i have n decrementing for every recursive call
   */
  public static void print1ToNTailRecursion(int n, int k) {
    if (n == 0) {
      return;
    }
    System.out.println(k);
    print1ToNTailRecursion(n - 1, k + 1);
  }


  public static void main(String[] args) {

    //lets have some tail recursion
    // tailRecursionExample(10);

    //normal recursion
    // print1ToN(10);

    //converting normal recursion to tail recursion
    print1ToNTailRecursion(10, 1);
  }
}
