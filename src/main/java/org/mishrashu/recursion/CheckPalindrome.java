package org.mishrashu.recursion;

import java.util.Scanner;

public class CheckPalindrome {

  public static Boolean isPalindrome(String s, int start, int end) {
    if (start >= end) {
      return true;
    }
    return (s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(
        "The input string " + s + " isPalindrome " + isPalindrome(s, 0, s.length() - 1));
  }

}
