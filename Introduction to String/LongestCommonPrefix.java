/*****
Longest Common Prefix

Solution
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*****/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        int minLen = Math.min(strs[0].length(), strs[strs.length-1].length());
        for(int i=0;i<minLen;i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i))
                break;
            result +=  strs[0].charAt(i);
        }
        return result;
    }
}
