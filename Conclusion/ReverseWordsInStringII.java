/*****
Reverse Words in a String III

Solution
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
*****/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                sb.append(words[i].charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
