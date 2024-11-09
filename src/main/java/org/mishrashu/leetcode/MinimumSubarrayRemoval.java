package org.mishrashu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumSubarrayRemoval {

  public static int minLength(String s){
    int length = s.length();
    Stack<Character> stack = new Stack<>();
    for(int i=0; i < length; i++ ){
     if(stack.isEmpty()){
       stack.add(s.charAt(i));
     }else{
       if( stack.peek()=='A' && s.charAt(i)=='B'){
         stack.pop();
       }else if(stack.peek()=='C' && s.charAt(i) =='D'){
         stack.pop();
       }else{
         stack.add(s.charAt(i));
       }
     }
    }
    return stack.size();
  }


  public static void main(String[] args) {


      int minLength = minLength("ABCDABCDDDDDABCD");
    System.out.println(minLength);
  }
}
