/*****
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*****/

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1)
            return ;
        
        //using another array
        // int[] n = new int[nums.length];
        // int j=0;
        // Arrays.fill(n,0);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != 0)
        //         n[j++] = nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = n[i];
        // }
        
        //without another array
        int nonZero =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
                nums[nonZero++] = nums[i];
        }
        while(nonZero < nums.length)
            nums[nonZero++] = 0;
    }
}
