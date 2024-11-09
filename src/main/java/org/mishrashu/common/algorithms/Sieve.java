package org.mishrashu.common.algorithms;

import java.util.Arrays;


public class Sieve {

  public static void sieveOfEratosthenes(int n) {
    boolean[] primes = new boolean[n];
    Arrays.fill(primes, true);

    //most efficient way to check if prime is
    for (int i = 2; i * i < n; i++) {
      if (primes[i]) {
        for (int j = 2 * i; j < n; j = j + i) {
          primes[j] = false;
        }
      }
    }

    for (int i = 2; i < n; i++) {
      if (primes[i]) {
        System.out.println(i);
      }
    }
  }


  public static void main(String[] args) {
    sieveOfEratosthenes(50000);
  }
}
