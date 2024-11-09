package org.mishrashu.leetcode;

import java.util.Arrays;
//nums = {1,1,2,2,3,3}

public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {

    if(nums == null || nums.length == 0) return 0;

    int i = 1;
    for(int j = 0; j< nums.length; j++){
      if(nums[j] != nums[i]){
        i++;
        nums[i] = nums[j];
      }
    }
  return i;
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
  }
}
