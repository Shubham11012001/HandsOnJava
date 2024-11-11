package org.mishrashu.recursion;

/**
 * Josephus Problem
 *
 * TC (5,3)
 * In first place 5 people are sitting on the table
 * pistol position - 0
 * kills - 2
 * As 2 is 3 position away from 0 (0,1,2)
 *
 * pistol position - 3
 * kills - 0
 * As 0 is 3 position away from 3 (3,4,0)
 *
 * pistol position - 1
 * kills 4
 * As 4 is 3 position away from 1 (1,3,4) As 2 is already dead
 *
 * pistol position - 1
 * kills itself
 * As 1 is 3 position away from 1 (1,3,1) as all others are dead
 *
 * Result 3
 */
public class JosephusProblem {

  public static int jos(int n, int k) {
    if (n == 1) {
      return 0;
    }
    return (jos(n - 1, k) + k) % n;

  }


  public static void main(String[] args) {
    System.out.println(jos(5, 3));
  }

}
