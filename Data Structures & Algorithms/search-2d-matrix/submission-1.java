class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int Rows = matrix.length;
       int Cols = matrix[0].length;

       int L = 0;
       int R = Rows * Cols - 1;

       while (L <= R) {
        int mid = (L + R) / 2;
        int row = mid / Cols;
        int col = mid % Cols;
        if (target > matrix[row][col]) {
            L = mid + 1;
        } else if (target < matrix[row][col]) {
            R = mid - 1;
        } else {
            return true;
        }
       }
       return false;
    }
}
