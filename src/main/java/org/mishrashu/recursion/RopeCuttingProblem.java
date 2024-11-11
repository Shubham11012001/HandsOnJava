package org.mishrashu.recursion;

public class RopeCuttingProblem {

  public static int ropeCuttingProblem(int n, int a, int b, int c) {
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      return -1;
    }

    int res = Math.max(
        Math.max(ropeCuttingProblem(n - a, a, b, c), ropeCuttingProblem(n - b, a, b, c)),
        ropeCuttingProblem(n - c, a, b, c));

    if (res == -1) {
      return -1;
    }
    return res + 1;
  }

  public static void main(String[] args) {

    System.out.println(ropeCuttingProblem(9, 2, 2, 2));

  }

}
