package org.mishrashu.recursion;

public class Factorial {

  public static int factorial(int n) {
    if (n < 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }


  //lets make this tail recursive
  public static int tailRecursiveFactorial(int n, int k){
    if(n < 1) return k;
    return tailRecursiveFactorial(n-1, k*n);
  }


  public static void main(String[] args) {
//    System.out.println(factorial(5));
    System.out.println(tailRecursiveFactorial(10,1));
  }

}
