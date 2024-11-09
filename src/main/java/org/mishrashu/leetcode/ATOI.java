package org.mishrashu.leetcode;

public class ATOI {


  public  static int myAtoi(String s) {
    Double number = 0.0;
    boolean negativeNumber = false;
    s = s.trim();

    for(int i = 0; i < s.length(); i++){
      if(i==0 && (s.charAt(i)=='-')){
        negativeNumber=true;
      }else if(i==0 && s.charAt(i) == '+'){
        continue;
      }else if((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57){
        number = number*10+ ((int) s.charAt(i) - (int) '0');
        if(negativeNumber && number*-1 <= Integer.MIN_VALUE){
          return Integer.MIN_VALUE;
        }else if(!negativeNumber && number >= Integer.MAX_VALUE){
          return Integer.MAX_VALUE;
        }
      }else{
        break;
      }
    }
      return negativeNumber ? number.intValue()*-1 : number.intValue();
  }



  public static void main(String[] args) {
    System.out.println(myAtoi("-2147483647"));
  }
}
