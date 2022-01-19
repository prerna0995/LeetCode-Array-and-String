/*****
Pascal's Triangle II

Solution
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
*****/


class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowIndex;i++){
            long curr = ((long)row.get(i-1)*(rowIndex-i+1))/i;
            row.add((int)curr);
        }
        return row;
    }
}
