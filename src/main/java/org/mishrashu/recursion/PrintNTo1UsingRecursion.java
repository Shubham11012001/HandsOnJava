package org.mishrashu.recursion;

public class PrintNTo1UsingRecursion {

  public static void printNto1UsingRecursion(int n){
    if(n==0) return;
    System.out.println(n);
    printNto1UsingRecursion(n-1);
  }

  public static void main(String[] args) {
    printNto1UsingRecursion(10);
  }

}
