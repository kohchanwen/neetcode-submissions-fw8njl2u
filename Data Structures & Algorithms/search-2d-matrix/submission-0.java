class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++) {
            int rowLength = matrix[i].length;
            int L = 0;
            int R = rowLength - 1;
            while(L <= R) {
                int mid = (L + R) /2;
                if(target < matrix[i][mid]) {
                    R = mid - 1;
                } else if(target > matrix[i][mid]) {
                    L = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
