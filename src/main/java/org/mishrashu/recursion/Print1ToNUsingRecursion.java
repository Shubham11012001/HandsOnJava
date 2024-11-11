package org.mishrashu.recursion;

public class Print1ToNUsingRecursion {

  public static void print1ToNUsingRecursion(int n){
    if(n==0) return;
    print1ToNUsingRecursion(n-1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    print1ToNUsingRecursion(10);
  }
}
