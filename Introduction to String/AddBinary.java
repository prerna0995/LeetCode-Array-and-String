/*****
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*****/



class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int lena = a.length()-1;
        int lenb = b.length()-1;
        int carry = 0, i = 0;
        while(lena >= 0 || lenb >= 0 || carry == 1){
            carry += lena>=0 ? a.charAt(lena) - '0': 0;
            carry += lenb>=0 ? b.charAt(lenb) - '0': 0;
            result = (carry%2) + result;
            carry /= 2;
            lena--;
            lenb--;            
        }
        return result;
    }
}
