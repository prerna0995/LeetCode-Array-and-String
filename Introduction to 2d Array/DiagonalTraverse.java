/*****
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]
*****/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean upward = true;
        int[] result = new int[n * m];
        int i=0,j=0;
                for(int k=0;k<n*m;){
                if(upward){
                    for(;i>=0 && j < m;i--,j++){
                        result[k++] = mat[i][j];
                    }
                    if(i<0 && j <= m-1){
                        i=0;
                    }
                    if (j == m) {
                        i = i+2;
                        j--;
                    }
                } else {
                    for(;j>=0 && i < n;i++,j--){
                        result[k++] = mat[i][j];
                    }
                    if(j<0 && i <= n-1){
                        j=0;
                    }
                    if (i == n) {
                        j = j+2;
                        i--;
                    }
                }
                upward = !upward;
            }
            return result;
    }
}
